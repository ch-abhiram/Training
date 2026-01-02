package DAY9.OOPs;

public class Example {
    public static void demo(){
        System.out.println("from demo...");
    }

    static void main(String[] args) {
        demo();
        Example.demo();
        Example e = new Example();
        e.demo();
    }
}
