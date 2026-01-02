package DAY3.DecisionMakingStatements.IfElse;
import java.util.Scanner;
public class PR18 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Select a menu no: ");
        int menu = scanner.nextInt();
        switch (menu){
            case 1:
                System.out.println("Chicken Biryani .............. 150/-");
                break;
            case 2:
                System.out.println("Mutton Biryani .............. 250/-");
                break;
            case 3:
                System.out.println("Mandi Biryani .............. 350/-");
                break;
            case 4:
                System.out.println("Mutton keema .............. 340/-");
                break;
            case 5:
                System.out.println("Finger bowl .............. 50/-");
                break;
            default:
                System.out.println("invalid");
        }
        scanner.close();
    }
}
