package DAY4.Loop_PR;
import java.util.Scanner;
public class PR15 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int otp = 1234;
        while (true){
            System.out.print("Enter otp: ");
            int enter = scanner.nextInt();
            if(enter == otp){
                System.out.println("welcome");
                break;
            }
        }
        scanner.close();
    }
}
