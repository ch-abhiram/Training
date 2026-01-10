package DAY11.OOPs.Inheritance;
class person1{
    static String name = "hello";
    int price = 100;
}
class stu extends person1{
    static String name = "hehe";
    int price = 200;
    void display(){
        System.out.println(name);
        System.out.println(super.name);
        System.out.println(price);
        System.out.println(super.price);
    }

    static void main(String[] args) {
        stu obj = new stu();
        obj.display();
    }
}
public class main2 {
}
