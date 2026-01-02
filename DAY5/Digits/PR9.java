package DAY5.Digits;

import java.util.Scanner;

public class PR9 {
    static int removeLastDigit(int a){
        int lastDigit = a/10;
        return lastDigit;
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a num: ");
        int num = scanner.nextInt();
        System.out.println("before "+num+ " after "+removeLastDigit(num));
    }
}
