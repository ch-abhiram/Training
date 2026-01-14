package DAY17.StringProblems;

import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String rev = new StringBuilder(s).reverse().toString();
        if(s.equals(rev)){
            System.out.println("palindrome");
        }
    }
}
