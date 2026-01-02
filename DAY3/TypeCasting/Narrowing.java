package DAY3.TypeCasting;

public class Narrowing {
    public static void main(String[] args){
        double d = 10.0;
        int i = (int)d;
        System.out.println(i);

        int i1 = 65;
        char c = (char)i1;
        System.out.println(c);

        double d1 = 10.0;
        byte b = (byte)d1;
        System.out.println(b);
    }
}
