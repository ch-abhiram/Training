package DAY15.Exceptions;

public class example {
    public static void main(String[] args) {
        try{
//            System.out.println(10/0);
            int[] a = {1,2,3,4,5};
            System.out.println(a[5]);
//        }catch (ArithmeticException e){
//            System.out.println("not divisible by zero");
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("index out of bound");
        }
    }
}
