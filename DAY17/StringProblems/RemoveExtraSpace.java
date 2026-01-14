package DAY17.StringProblems;

import java.util.Scanner;

public class RemoveExtraSpace {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String sc = s.trim().replaceAll("\\s+"," ");
        System.out.println(sc);
        String scc = new StringBuffer(sc).reverse().toString();
        System.out.println(scc);
    }
}
