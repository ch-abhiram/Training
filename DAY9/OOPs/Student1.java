package DAY9.OOPs;

public class Student1 {
    private int id;
    private String name;
    Student1(int id,String name){
        this.id = id;
        this.name = name;
    }

    static void main(String[] args) {
        Student1 s = new Student1(101,"Huka");
        accept(s);
    }

    //method accepting object reference
    public static void accept(Student1 s1){
        System.out.println(s1.id);
        System.out.println(s1.name);
    }
}
