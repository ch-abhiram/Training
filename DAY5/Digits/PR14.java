package DAY5.Digits;

import java.util.Scanner;

public class PR14 {
    static int reverseOfDigit(int a){
        int rev = 0;
        while(a!=0){
            int last = a%10;
            a = a/10;
            rev = rev*10+last;
        }
        return rev;
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a num: ");
        int num = scanner.nextInt();
        System.out.println("reverse of "+num+" is "+reverseOfDigit(num));
    }
}
