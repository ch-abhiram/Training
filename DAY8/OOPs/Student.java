package DAY8.OOPs;

public class Student {
    int eid;
    Student(int eid){
        this.eid = eid;
    }

    public static void main(String[] args){
        Student s = new Student(101);
        System.out.println(s.eid);

    }
}
