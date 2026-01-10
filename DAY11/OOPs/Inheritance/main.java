package DAY11.OOPs.Inheritance;

public class main {
    static void main(String[] args) {
        //w.r.t parent className
        Super.demo();
        //Super.test();
        //Super.te();
        System.out.println("***********************");

        //w.r.t child className
        Sub.demo();
        Sub.dis();
//      Sub.test();
//      Sub.te();
        System.out.println("***********************");

        //w.r.t parent obj ref
        Super obj = new Super();
        obj.demo();
        obj.test();
//        obj.dis()
//        obj.te();
        System.out.println("***********************");

        //w.r.t child obj ref
        Sub obj1 = new Sub();
        obj1.demo();
        obj1.test();
        obj1.dis();
        obj1.te();
        System.out.println("***********************");
//        derived.display();
        derived.test();
    }
}
