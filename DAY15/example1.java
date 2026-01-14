package DAY15;

public class example1 {
    public static void main(String[] args) {
        System.out.println("booooo....");
        try {
            System.out.println("baaaaaaa......");
            try {
                System.out.println(10/0);
            }catch (ArithmeticException e){
                System.out.println("radhu output radhu");
            }finally {
                System.out.println("vacha finally");
            }
        }finally {
            System.out.println("bayata");
        }
    }
}
