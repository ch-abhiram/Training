package DAY7.Problems;

public class PR2 {
    static void main(String[] args) {
        int a = 10;
        int b = 20;
        a = a^b;
        b = a^b;
        a = a^b;
        System.out.println(a+" "+b);
    }
}
