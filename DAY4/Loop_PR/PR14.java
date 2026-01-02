package DAY4.Loop_PR;

import java.util.Scanner;

public class PR14 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String input ;
        do{
            System.out.println("menu");
            System.out.println("Check balance");
            System.out.println("Withdraw");
            System.out.println("Logout");
            System.out.print("Enter your choice: ");
            input = scanner.nextLine();
            if(input.equalsIgnoreCase("logout")){
                System.out.println("tata");
                break;
            }
        }while (true);
    }
}
