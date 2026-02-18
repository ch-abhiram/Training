package first.src.M1.Course;



public class Main {

    public static void main(String[] args) {

        CourseService service = new CourseService();

        // ---------- Add Courses ----------
        service.addCourse(new Course(1, "Java Basics", "Programming", 500, 2));
        service.addCourse(new Course(2, "Data Structures", "Programming", 600, 1));
        service.addCourse(new Course(3, "UI Design", "Design", 400, 3));
        service.addCourse(new Course(4, "Digital Marketing", "Business", 700, 2));

        // ---------- Add Students ----------
        service.addStudent(new Student(1, "Amit", "Hyderabad", "Premium"));
        service.addStudent(new Student(2, "Sneha", "Warangal", "Regular"));
        service.addStudent(new Student(3, "Rahul", "Hyderabad", "Premium"));
        service.addStudent(new Student(4, "Priya", "Bangalore", "Regular"));

        // ---------- Enrollment Tests ----------
        try {
            service.enrollStudent(1, 1);
            service.enrollStudent(2, 1);
            service.enrollStudent(3, 2);

            System.out.println("Enrollments successful ✅");

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        // ---------- Exception Test (Course Full) ----------
        try {
            service.enrollStudent(4, 2); // Course 2 has only 1 seat
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }

        // ---------- Print Reports ----------
        System.out.println("\nTotal Enrollments: "
                + service.getTotalEnrollments());

        System.out.println("\nCourses Grouped by Category:");
        service.groupCoursesByCategory()
                .forEach((k, v) ->
                        System.out.println(k + " -> " + v.size()));

        System.out.println("\nStudents Grouped by City:");
        service.groupStudentsByCity()
                .forEach((k, v) ->
                        System.out.println(k + " -> " + v.size()));

        System.out.println("\nPremium vs Regular Partition:");
        service.partitionPremiumStudents()
                .forEach((k, v) ->
                        System.out.println((k ? "Premium" : "Regular")
                                + " -> " + v.size()));

        System.out.println("\nAverage Price by Category:");
        service.averagePriceByCategory()
                .forEach((k, v) ->
                        System.out.println(k + " -> " + v));
    }
}
