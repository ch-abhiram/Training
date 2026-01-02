package DAY4.Methods;
import java.util.Scanner;
public class PR10 {
    static boolean evenOdd(int a){
        if(a%2==0){
            return true;
        }else {
            return false;
        }
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int no = scanner.nextInt();
        boolean result = evenOdd(no);
        if(result){
            System.out.println("Even");
        }else {
            System.out.println("Odd");
        }
        scanner.close();
    }
}
