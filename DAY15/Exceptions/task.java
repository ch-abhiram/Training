package DAY15.Exceptions;

import java.util.Scanner;

public class task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int usr1 = scanner.nextInt();
        int usr2;
        while (true){
            try{
                usr2 = scanner.nextInt();

                int res = usr1/usr2;
                break;

            } catch (ArithmeticException e) {
                System.out.println("don't enter zero.....");
            }
        }
    }
}
