package DAY4.Methods;

import java.util.Scanner;

public class PR14 {
    static void mul(int a){
        for(int i=1;i<=10;i++){
            System.out.println(a+" * "+i+" = "+(a*i));
        }
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        mul(num);
    }
}
