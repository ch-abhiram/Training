package DAY3.DecisionMakingStatements.IfElse;
import java.util.Scanner;
public class PR11 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String pass = scanner.nextLine();
        if(pass.length()<6){
            System.out.println("Weak pass");
        } else if (pass.length()>=6 && pass.length()<=9) {
            System.out.println("Medium pass");
        }else if (pass.length()>=10) {
            System.out.println("Strong pass");
        }
        scanner.close();
    }
}
