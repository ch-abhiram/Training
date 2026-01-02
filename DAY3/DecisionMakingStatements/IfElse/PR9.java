package DAY3.DecisionMakingStatements.IfElse;
import java.util.Scanner;
public class PR9 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter marks: ");
        int marks = scanner.nextInt();
        System.out.println("Income: ");
        int income = scanner.nextInt();
        if(marks>=85 && income<=300000){
            System.out.println("eligible");
        }else {
            System.out.println("not eligible");
        }
        scanner.close();
    }
}
