package DAY4.Loop_PR;
import java.util.Scanner;
public class PR13 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int balance = 1000;
        while (true){
            System.out.print("Enter withdraw amount: ");
            int withdraw = scanner.nextInt();
            if(withdraw>balance){
                System.out.println("Insufficent balance");
                System.out.println(balance);
                break;
            }else {
                balance-=withdraw;
                System.out.println(balance);
            }
        }
        scanner.close();
    }
}
