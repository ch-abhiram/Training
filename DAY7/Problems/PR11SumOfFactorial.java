package DAY7.Problems;

import java.util.Scanner;

public class PR11SumOfFactorial {
    static void sumFactorial(int a){
        int sum = 0;
        while (a!=0){
            int result = factorial(a);
            sum+=result;
            a--;
        }
        System.out.println("sum of factorial "+sum);
    }
    static int factorial(int a){
        if(a==0 || a==1){
            return 1;
        }else return a*factorial(a-1);
    }

    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        sumFactorial(num);
    }
}
