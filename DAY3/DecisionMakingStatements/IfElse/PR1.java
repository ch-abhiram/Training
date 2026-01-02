package DAY3.DecisionMakingStatements.IfElse;
import java.util.Scanner;
public class PR1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int no = scanner.nextInt();
        if(no%2==0){
            System.out.println("Even no");
        }else{
            System.out.println("Odd no");
        }
        scanner.close();
    }
}
