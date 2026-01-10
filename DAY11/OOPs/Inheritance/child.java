package DAY11.OOPs.Inheritance;

class parent{
    static int a = 10;
    static void display(){
        System.out.println("from parent.....");
    }
    static {
        int b = 10;
        System.out.println("hello.....");
    }
}
public class child extends parent{
    static void main(String[] args) {
        System.out.println(a);
        display();

    }
}
