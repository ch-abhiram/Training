package DAY5.Digits;

import java.util.Scanner;

public class PR10 {
    static int countNoDigit(int a){
        int sum = 0;
        while(a!=0){
             a = a/10;
            sum++;
        }
        return sum;
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a num: ");
        int num = scanner.nextInt();
        System.out.println("total no of digits of "+num+" is "+countNoDigit(num));
    }
}
