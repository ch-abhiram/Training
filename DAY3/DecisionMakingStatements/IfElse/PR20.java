package DAY3.DecisionMakingStatements.IfElse;
import java.util.Scanner;
public class PR20 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        char ch = scanner.next().charAt(0);
        if((ch>='a' && ch<='z') || (ch>='A' && ch<='Z')){
            System.out.println("Character is an Alphabet");
        }else if(ch>='0' && ch<='9'){
            System.out.println("Character is a Number");
        }else {
            System.out.println("Special Character");
        }
        scanner.close();
    }
}
