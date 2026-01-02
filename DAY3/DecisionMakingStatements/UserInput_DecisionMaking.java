package DAY3.DecisionMakingStatements;
import java.util.Scanner;

public class UserInput_DecisionMaking {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String day = scanner.nextLine();
        switch (day){
            case "monday":
                System.out.println("Upma");
                break;
            case "tuesday":
                System.out.println("Idly");
                break;
            case "wednesday":
                System.out.println("Poori");
                break;
            case "thrusday":
                System.out.println("Vada");
                break;
            case "friday":
                System.out.println("Bonda");
                break;
            case "saturday":
                System.out.println("Poha");
                break;
            case "sunday":
                System.out.println("Dosa");
                break;
            default:
                System.out.println("invalid input");
        }
        scanner.close();
    }
}
