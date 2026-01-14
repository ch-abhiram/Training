package DAY17.StringProblems;

import java.util.Scanner;

public class remove {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        char[] c = new char[s.length()-2];
        int index = 0;
        for(int i =1;i<s.length()-1;i++){
            c[index++] = s.charAt(i);
        }
        System.out.println(new String(c));
    }
}
