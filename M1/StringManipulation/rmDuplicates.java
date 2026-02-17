package first.src.M1.StringManipulation;

import java.util.Scanner;

public class rmDuplicates {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();

        StringBuilder res = new StringBuilder();
        char prev = input.charAt(0);

        for(int i = 1;i<input.length();i++){
            char current = input.charAt(i);
            if(current == prev){
                continue;
            }else{
                res.append(prev);
                prev = current;
            }

        }
        res.append(prev);

        System.out.println(res);
    }
}
