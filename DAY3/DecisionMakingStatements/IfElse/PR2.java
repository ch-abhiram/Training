package DAY3.DecisionMakingStatements.IfElse;
import java.util.Scanner;
public class PR2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int no = scanner.nextInt();
        if(no>=0){
            System.out.println("+ve no");
        }else{
            System.out.println("-ve no");
        }
        scanner.close();
    }
}
