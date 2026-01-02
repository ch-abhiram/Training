package DAY7.Problems;

import java.util.Scanner;

public class PR19NeonNumber {
    static void neon(int a){
        int num = a*a;
        int sum = 0;
        while(num!=0){
            int last = num%10;
            sum+=last;
            num/=10;
        }
        if(sum == a){
            System.out.println("it is a neon number");
        }else System.out.println("it is not a neon number");
    }

    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        neon(num);
    }
}
