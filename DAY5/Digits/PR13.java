package DAY5.Digits;

import java.util.Scanner;

public class PR13 {
    static int mulOfDigit(int a){
        int sum = 1;
        while(a>0){
            int last = a%10;
            a = a/10;
            sum*=last;
        }
        return sum;
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a num: ");
        int num = scanner.nextInt();
        System.out.println("sum of digits of "+num+" is "+mulOfDigit(num));
    }
}
