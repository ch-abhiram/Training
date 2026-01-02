package DAY3.DecisionMakingStatements.IfElse;
import java.util.Scanner;
public class PR13 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter marks: ");
        int marks = scanner.nextInt();
        System.out.print("Do you have sports quota(y/n): ");
        char sports = scanner.next().charAt(0);
        if(marks>=90 && sports == 'y'){
            System.out.println("Tire-1");
        } else if (marks>=90) {
            System.out.println("Tier-2");
        } else if (marks>=75 && marks<90) {
            System.out.println("Tier-3");
        }else {
            System.out.println("Rejected");
        }
        scanner.close();
    }
}
