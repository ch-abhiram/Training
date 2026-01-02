package DAY3.DecisionMakingStatements.IfElse;
import java.util.Scanner;
public class PR7 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int no1 = scanner.nextInt();
        int no2 = scanner.nextInt();
        int no3 = scanner.nextInt();
        if(no1>no2 && no1>no3){
            System.out.println("greatest no " + no1);
        } else if (no2>no1 && no2>no3) {
            System.out.println("greatest no " +no2);
        }else {
            System.out.println("greatest no " +no3);
        }
        scanner.close();
    }
}
