package DAY11.OOPs.Inheritance;

import java.util.Scanner;

public class Palindrome {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        int first  = 0;
        int last = word.length()-1;
        boolean palin = true;
        while(first<last){
            if(word.charAt(first)!= word.charAt(last)){
                palin = false;

            }
            first++;
            last--;
        }
        System.out.println(palin);
    }
}
