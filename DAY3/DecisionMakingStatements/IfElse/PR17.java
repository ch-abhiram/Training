package DAY3.DecisionMakingStatements.IfElse;
import java.util.Scanner;
public class PR17 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter num1: ");
        double num1 = scanner.nextInt();
        System.out.print("Enter num2: ");
        double num2 = scanner.nextInt();
        System.out.println("Select operator");
        System.out.println("+ - * /");
        char ch = scanner.next().charAt(0);
        switch (ch){
            case '+':
                System.out.println(num1+" + "+num2+" = "+(num1+num2));
                break;
            case '-':
                System.out.println(num1+" - "+num2+" = "+(num1-num2));
                break;
            case '*':
                System.out.println(num1+" * "+num2+" = "+(num1*num2));
                break;
            case '/':
                if(num1 == 0){
                    System.out.println("Not divisible");
                }else {
                    System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
                }break;
            default:
                System.out.println("invalid");
        }

    }
}
