package DAY7.Problems;

import java.util.Scanner;

public class PR3Palindrome {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = scanner.nextInt();
        int temp = a;
        int rev = 0;
        while(a!=0){
            int last = a%10;
            rev = (rev*10)+last;
            a = a/10;
        }
        if(rev == temp){
            System.out.println("Palindrome");
        }
    }
}
