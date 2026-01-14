package DAY14.String;

public class Compare {
    static void main(String[] args) {
        String s1 = "cat";
        String s2 = "ant";
        System.out.println(s1.compareTo(s2));

        String s3 = "anu";
        System.out.println(s2.compareTo(s3));

        String s4 = "ANT";
        System.out.println(s2.compareTo(s4));
        System.out.println(s2.compareToIgnoreCase(s4));
    }
}
