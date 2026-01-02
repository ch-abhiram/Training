package DAY3.LoopStatements;
import java.util.Scanner;
public class PRWlcome {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        char yesOrNo;
        do{
            System.out.println("Welcome");
            System.out.print("Do you want to print the msg again: ");
            yesOrNo = scanner.next().charAt(0);
        }while (yesOrNo == 'y');

    }
}
