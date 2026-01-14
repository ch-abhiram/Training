package DAY17.StringProblems;

import java.util.Scanner;

public class spacecount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s =scanner.nextLine();
        int count = 0;
        for(int i= 0 ;i<s.length();i++){
            if(s.charAt(i) == ' '){
                count++;
            }
        }
        System.out.println(count);
    }
}
