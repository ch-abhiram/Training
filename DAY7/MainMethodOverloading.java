package DAY7;

public class MainMethodOverloading {
    public static void main(String[] args) {
        System.out.println("From main....");
        main(10,22);
        main('m');
    }

    public static void main(int a,int b) {
        System.out.println(a+b);
    }

    public static void main(char c) {
        System.out.println(c);
    }
}
