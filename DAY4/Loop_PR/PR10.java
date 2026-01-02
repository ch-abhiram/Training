package DAY4.Loop_PR;
import java.util.Scanner;
public class PR10 {
    public static void main(String[] args){
        Scanner scanner =new Scanner(System.in);
        int num = scanner.nextInt();
        while (true){
            if(num>=0){
                System.out.println("+ve no");
                break;
            }else {
                System.out.println("enter +ve no: ");
                num = scanner.nextInt();
            }
        }
        scanner.close();
    }
}
