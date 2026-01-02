package DAY9.OOPs;

public class check {
    static int a = 10;
    static {
        System.out.println(a);
        System.out.println("from sib...");
    }

    static void main(String[] args) {
        System.out.println("from main...");
    }
    static {
        System.out.println("from sib...");
    }
}
