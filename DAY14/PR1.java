package DAY14;
class student{
    int id;
    String name;
    student(int id, String name){
        this.id = id;
        this.name = name;
        System.out.println("student....");
    }

    @Override
    public String toString() {
        return "name "+name+" id "+id;
    }

    @Override
    public boolean equals(Object obj) {
        student stu = (student) obj;
        return this.id == stu.id && this.name == stu.name;
    }
}
public class PR1 {
    static void main(String[] args) {
        student stu = new student(101,"huka");
        System.out.println(stu);
        student stu1 = new student(101,"huka");
        System.out.println(stu.equals(stu1));
    }
}
