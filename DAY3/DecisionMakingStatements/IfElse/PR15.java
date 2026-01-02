package DAY3.DecisionMakingStatements.IfElse;
import java.util.Scanner;
public class PR15 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your role: ");
        String role = scanner.nextLine();
        String pass;
        if(role.equals("admin")){
            System.out.print("Enter pass");
            pass = scanner.nextLine();
            if(pass.equals("admin")){
                System.out.println("Welcome");
            }else System.out.println("invalid");
        }else if(role.equals("manager")){
            System.out.print("Enter pass");
            pass = scanner.nextLine();
            if(pass.equals("man")){
                System.out.println("Welcome");
            }else System.out.println("invalid");
        }else if(role.equals("user")){
            System.out.print("Enter pass");
            pass = scanner.nextLine();
            if(pass.equals("1234")){
                System.out.println("Welcome");
            }else System.out.println("invalid");
        }else System.out.println("invlaid role");
    }
}
