package DAY15.Exceptions;

public class Throws {
    public static void getage(int age) throws ArithmeticException{
        if(age<18){
            throw new ArithmeticException("Invalid age");
        }else {
            System.out.println("eligible");
        }
    }
    public static void main(String[] args) {
        try{
            getage(16);
        }catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}
