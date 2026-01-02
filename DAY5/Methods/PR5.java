package DAY5.Methods;
import java.util.Scanner;
public class PR5 {
    static int greatest(int a, int b,int c){
        int greatNo = (a>b)?(a>c?a:c):(b>c?b:c);
        return greatNo;
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter num1: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter num2: ");
        int num2 = scanner.nextInt();
        System.out.print("Enter num3: ");
        int num3 = scanner.nextInt();
        int result = greatest(num1,num2,num3);
        System.out.println(result);
    }
}
