package DAY4.Loop_PR;
import java.util.Scanner;
public class PR11 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String input ;
        do{
            System.out.println("menu");
            System.out.println("play");
            System.out.println("exit");
            System.out.print("Enter your choice: ");
            input = scanner.nextLine();
            if(input.equalsIgnoreCase("exit")){
                System.out.println("tata");
                break;
            }
        }while (true);
    }
}
