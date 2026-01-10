package DAY11.OOPs.Inheritance;

class person{
    String name;
    person(String name){
        this.name = name;
    }
//    person(){
//
//    }
}
class student extends person{
    int sid;
    student(String name,int sid){
        super(name);
        this.sid = sid;

    }
}
public class main1 {
    static void main(String[] args) {
        student stu = new student("hello",101);
        System.out.println(stu.name);
        System.out.println(stu.sid);

    }
}
