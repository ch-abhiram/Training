package DAY17.StringProblems;

import java.util.Scanner;

public class noOfWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String[] count = s.split(" ");
        System.out.println(count.length);
    }
}
