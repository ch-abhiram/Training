package DAY4.Loop_PR;
import java.util.Scanner;
public class PR9 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int pass = scanner.nextInt();
        while (true){
            if(pass == 0000 ){
                System.out.println("welcome");
                break;
            }else {
                System.out.println("Wrong pass try again");
                pass = scanner.nextInt();
            }
        }
        scanner.close();
    }
}
