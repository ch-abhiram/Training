package DAY12.OOPs.Polymorphism;

public class vaiableShadowing {
    int a =20;
    static void dis(){
        System.out.println("hello");
    }

    static void main(String[] args) {
        int a = 15;
        System.out.println(a);
//        System.out.println(vaiableShadowing.a);
        vaiableShadowing obj = new vaiableShadowing();
        System.out.println(obj.a);
        vaiableShadowing.dis();

    }
}
