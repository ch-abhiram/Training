package DAY3.DecisionMakingStatements.IfElse;
import java.util.Scanner;
public class PR6 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int no  = scanner.nextInt();
        if(no>=10 && no<=20){
            System.out.println("true");
        }else {
            System.out.println("false");
        }
        scanner.close();
    }
}
