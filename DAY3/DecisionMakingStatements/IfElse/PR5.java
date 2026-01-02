package DAY3.DecisionMakingStatements.IfElse;
import java.util.Scanner;
public class PR5 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        char ch = scanner.next().charAt(0);
        ch = Character.toLowerCase(ch);
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
            System.out.println("char is a Vowel");
        }else {
            System.out.println("char is not a Vowel");
        }
        scanner.close();
    }
}
