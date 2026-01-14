package DAY17.StringProblems;

import java.util.Scanner;

public class upper_lower {
    static String u_l(String s){
        char[] c = new char[s.length()];
        for(int i = 0;i<s.length();i++){
            char ch = s.charAt(i);
            if((i+1)%2 == 0){
                c[i] = Character.toUpperCase(ch);
            }else {
                c[i] = Character.toLowerCase(ch);
            }
        }
        s = new String(c);
        return s;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        System.out.println(u_l(s));
    }
}
