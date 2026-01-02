package DAY5.Digits;

import java.util.Scanner;

public class PR11 {
    static int firstDigitEven(int a){
       a = Math.abs(a);
       while (a>=10){
           a = a/10;
       }
        return (a%2==0)?1:0;
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a num: ");
        int num = scanner.nextInt();
        int result = firstDigitEven(num);
        if(result == 1){
            System.out.println("first digit is even");
        }else System.out.println("first digit is odd");
    }
}
