package DAY3.DecisionMakingStatements.IfElse;
import java.util.Scanner;
public class PR4 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int no = scanner.nextInt();
        if(no%5==0 && no%3==0){
            System.out.println("Its divisible by 5 & 3");
        }else{
            System.out.println("Not divisible");
        }
        scanner.close();
    }
}
