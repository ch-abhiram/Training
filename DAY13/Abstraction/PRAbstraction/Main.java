package DAY13.Abstraction.PRAbstraction;

public class Main {
    static void main(String[] args) {
        BasicCalci obj = new basic();
        System.out.println(obj.add(2,2));
        System.out.println(obj.sub(3,2));
        System.out.println(obj.mul(4,5));
        System.out.println("******************");
        calVers1 obj1 = new vers1();
        System.out.println(obj1.Power(2,5));
        System.out.println("******************");
        calVers2 obj2 = new vers2();
        System.out.println(obj2.square(4));
    }
}
