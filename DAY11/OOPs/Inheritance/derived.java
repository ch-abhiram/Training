package DAY11.OOPs.Inheritance;

public class derived extends base{
    static {
        System.out.println("child is loaded...");
    }
    static void test(){
        System.out.println("child static method...");
    }

    static void main(String[] args) {
        //parent member
        base.display();
        //child member
//        derived.test();
    }
}
