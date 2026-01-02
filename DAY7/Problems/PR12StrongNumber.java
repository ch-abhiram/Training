package DAY7.Problems;

import java.util.Scanner;

public class PR12StrongNumber {
    static void sumFactorial(int a){
        int sum = 0;
        int temp = a;
        while (a!=0){
            int last = a%10;
            int result = factorial(last);
            sum+=result;
            a=a/10;
        }
        System.out.println(sum);

        if(sum == temp){
            System.out.println(temp+" is a strong number");
        }
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
