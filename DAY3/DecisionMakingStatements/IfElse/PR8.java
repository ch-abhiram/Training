package DAY3.DecisionMakingStatements.IfElse;
import java.util.Scanner;
public class PR8 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int balance = 10000;
        System.out.println("Enter Withdrawal Amount: ");
        int amount = scanner.nextInt();
        if(balance>=amount && amount%100==0){
            System.out.println("Withdraw");
        }else{
            System.out.println("Insufficient");
        }
    }
}
