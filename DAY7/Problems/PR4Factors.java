package DAY7.Problems;

import java.util.Scanner;

public class PR4Factors {
    static void factorSumProduct(int a){
        for(int i = 1;i<=a;i++){
            if(a%i==0){
                System.out.println("factors of "+ a+ " are "+i);
            }
        }
        int sum = 0;
        for(int i = 1;i<=a;i++){
            if(a%i==0){
                sum+=i;
            }
        }
        System.out.println("sum of factors: "+sum);
        int product = 1;
        for(int i = 1;i<=a;i++){
            if(a%i==0){
                product*=i;
            }
        }
        System.out.println("product of factors: "+product);
    }

    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        factorSumProduct(a);
    }
}
