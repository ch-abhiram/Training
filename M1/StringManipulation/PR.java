package first.src.M1.StringManipulation;

import java.util.Scanner;

public class PR {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        String[] arr = input.split(" ");

        StringBuilder str = new StringBuilder();
        for(String i: arr){
            StringBuilder temp = new StringBuilder(i);
            str.append(temp.reverse()).append(" ");
        }

        input = str.toString();
        for(char i: input.toCharArray()){
            if(Character.isUpperCase(i)){
                Character.toLowerCase(i);
            }else {
                Character.toUpperCase(i);
            }
        }

        System.out.println(input);

    }
}
