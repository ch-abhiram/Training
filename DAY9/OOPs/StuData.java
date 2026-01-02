package DAY9.OOPs;

public class StuData {
    private String name;
    private int rollno;
    StuData(String name,int age){
        System.out.println(name);
        System.out.println(age);
    }

    static void main(String[] args) {
        StuData obj = new StuData("abhi",21);
    }
}
