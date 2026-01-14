package DAY17.StringProblems;

import java.util.Scanner;

public class Tolower {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        char[] c = new char[s.length()];
        for(int i = 0;i < s.length();i++){
            if(s.charAt(i)>='A' && s.charAt(i)<='Z'){
                c[i] = (char)(s.charAt(i)+32);
            }else {
                c[i] = s.charAt(i);
            }
        }
        System.out.println(new String(c));
    }
}
