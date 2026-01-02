package DAY3.DecisionMakingStatements.IfElse;
import java.util.Scanner;
public class PR14 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int rating = scanner.nextInt();
        switch (rating){
            case 1:
            case 2:
                System.out.println("No hike");
                break;
            case 3:
                System.out.println("10% hike");
                break;
            case 4:
                System.out.println("20% hike");
                break;
            case 5:
                System.out.println("30% hike");
                break;
            default:
                System.out.println("error");
        }
        scanner.close();
    }
}
