package DAY7.Problems;

import java.util.Scanner;

public class PR7PrimeNumberInARange {
    static void prime(int a,int b){
        for(int i = a;i<=b;i++){
            if(i<2) continue;
            boolean isPrime = true;
            for(int j=2;j<=i/2;j++){
                if(i%j == 0){
                    isPrime  = false;
                    break;
                }
            }
            if(isPrime){
                System.out.println(i+" is a prime number");
            }
        }

    }


    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        prime(a,b);
    }
}
