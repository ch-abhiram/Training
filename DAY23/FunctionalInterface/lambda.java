package DAY23.FunctionalInterface;
interface calci{
//    int add(int a,int b);
//    String demo();
    boolean evenOdd(int a);
}

public class lambda {
    public static void main(String[] args) {
//        calci obj = (a,b)->a+b;
//        System.out.println(obj.add(2,3));
//        calci obj = ()->"hello";
//        System.out.println(obj.demo());
        calci obj = (a)->a%2==0;
        System.out.println(obj.evenOdd(4));
    }
}
