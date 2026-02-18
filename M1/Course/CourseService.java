package first.src.M1.Course;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CourseService {
    private List<Course> courses = new ArrayList<>();
    private List<Student> students = new ArrayList<>();
    private List<Enrollment> enrollments = new ArrayList<>();

    public void addCourse(Course course){
        courses.add(course);
    }
    public void addStudent(Student stu){
        students.add(stu);
    }
    public void enrollStudent(int studentId,int courseId) throws StudentNotFoundException, CourseFullException {
        Student stu = students.stream().filter(s->s.getId() == studentId).findFirst().orElseThrow(()->
                new StudentNotFoundException("Student not found"));

        Course course = courses.stream().filter(c->c.getId() == courseId).findFirst().orElseThrow(()->
                new StudentNotFoundException("Course not found"));

        if(course.getAvailableSeats()<=0){
            throw new CourseFullException("Course is full no available seats");
        }
        Enrollment enrollment = new Enrollment(stu,course);
        enrollments.add(enrollment);
        course.decreaseSeat();

    }

    public void cancelEnrollment(int studentId,int courseId) throws StudentNotFoundException {
        Enrollment enroll = enrollments.stream().filter(e->e.getStudent().getId() == studentId && e.getCourse().getId() == courseId).findFirst().orElseThrow(()->
                new StudentNotFoundException("record not found"));
        enrollments.remove(enroll);
        enroll.getCourse().increaseSeat();


    }

    public long getTotalEnrollments(){
        long res = enrollments.size();
        return res;
    }

    public Map<String, List<Course>> groupCoursesByCategory(){
        Map<String,List<Course>> res = courses.stream().collect(Collectors.groupingBy(c->c.getCategory()));
        return res;
    }
    public Map<String, List<Student>> groupStudentsByCity() {
        Map<String,List<Student>> res = students.stream().collect(Collectors.groupingBy(s->s.getCity()));
        return res;
    }

    public Map<Boolean, List<Student>> partitionPremiumStudents() {
        Map<Boolean,List<Student>> res = students.stream().collect(Collectors.partitioningBy(s->s.getType().equals("Premium")));
        return res;
    }
    public Map<String, Double> averagePriceByCategory() {
        Map<String, Double> group = courses.stream().collect(Collectors.groupingBy(Course::getCategory,Collectors.averagingDouble(Course::getPrice)));
        return group;
    }
}
