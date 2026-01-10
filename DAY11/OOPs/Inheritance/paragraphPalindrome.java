package DAY11.OOPs.Inheritance;

import java.util.Scanner;

public class paragraphPalindrome {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String para = scanner.nextLine();
        String[] word = para.split(" ");
        char c = 'n';
        int count = 0;
        for(String i: word){
            int first = 0;
            int last = i.length()-1;
            boolean palindrome = true;
            while(first<last){
                if(i.charAt(first)!=i.charAt(last)){
                    palindrome = false;
                }
                first++;
                last--;
            }
            if(palindrome){
                System.out.println(i+" is palindrome");
                for(int j = 0;j<=i.length()-1;j++){
                    if(i.charAt(j) == c){
                        count++;
                        break;
                    }
                }
            }

        }
        System.out.println(count);
    }
}
