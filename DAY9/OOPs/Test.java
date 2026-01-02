package DAY9.OOPs;

public class Test {
    static int a;

    static void main(String[] args) {
        System.out.println(a);//directly
        System.out.println(Test.a);//class name
        Test t = new Test();
        System.out.println(t.a);//obj
    }
}
