package DAY14.String;

public class Main {
    static void main(String[] args) {
        String s1 = "hai";
        String s2 = "bye";
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
        String s3 = new String("hai");
        System.out.println(s1==s3);
        System.out.println(s1.equals(s3));
    }
}
