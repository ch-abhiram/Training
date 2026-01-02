package DAY7.Problems;

import java.util.Scanner;

public class PR10Factorial {
    static int factorial(int a){
        if(a == 0 || a == 1){
            return 1;
        }else return a*factorial(a-1);
    }

    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        System.out.println("factorial of "+num+" is "+factorial(num));
    }
}
