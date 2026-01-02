package DAY4.Methods;
import java.util.Scanner;
public class PR1 {
    static void login(){
        System.out.println("Welcome");
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String user = scanner.nextLine();
        if(user.equalsIgnoreCase("login"))
            login();
    }
}
