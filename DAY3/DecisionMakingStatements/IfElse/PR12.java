package DAY3.DecisionMakingStatements.IfElse;
import java.util.Scanner;
public class PR12 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        if(age<12){
            System.out.println("Price 100/-");
        } else if (age>=12 && age<=60) {
            System.out.println("Price 200/-");
        }else {
            System.out.println("Price 150/-");
        }
    }
}
