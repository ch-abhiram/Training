package DAY17.StringProblems;

import java.util.Scanner;

public class stringToStringArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String[] arr = s.split(" ");
        for(String i: arr){
            System.out.println(i);
        }
        System.out.println(s.replace(" ",""));

    }
}
