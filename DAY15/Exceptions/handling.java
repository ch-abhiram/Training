package DAY15.Exceptions;

public class handling {
    public static void main(String[] args) {
        int a = 9;
        try {
            a=a/0;
        }catch (ArithmeticException e){
            System.out.println("cannot divisible by zero");
        }
    }
}
