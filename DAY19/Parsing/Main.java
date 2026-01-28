package DAY19.Parsing;

public class Main {
    public static void main(String[] args) {
        //parsing
        String s = "12345";
        int b = Integer.parseInt(s);

        System.out.println(b);

        Integer c = Integer.valueOf(s);
        System.out.println(c);

        //unparsing
        int a = 10;
        String s1 = String.valueOf(a);
        System.out.println(s1+"heheheh");
        Integer a1 = 11;
        String s2 = Integer.toString(a1);
        System.out.println(s2);
    }
}
