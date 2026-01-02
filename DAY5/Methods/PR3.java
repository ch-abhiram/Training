package DAY5.Methods;

import java.util.Scanner;

public class PR3 {
    static void odd(int a, int b){
        for(int i = a;i<=b;i++){
            if(i%2!=0){
                System.out.println("the number: "+i+" is odd");
            }
        }
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter num1: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter num2: ");
        int num2 = scanner.nextInt();
        odd(num1,num2);
    }
}
