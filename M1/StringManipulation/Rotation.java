package first.src.M1.StringManipulation;

import java.util.Scanner;

public class Rotation {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        int k = sc.nextInt();

        //left shift
        k = k%str.length();

        String result = str.substring(k)+str.substring(0,k);

        System.out.println(result);

        //right shift
        String result1 = str.substring(str.length()-k)+str.substring(0,str.length()-k);
        System.out.println(result1);

    }
}
