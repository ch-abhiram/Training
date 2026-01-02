package DAY7.Problems;

import java.util.Scanner;

public class PR6Prime {
    static void prime(int a){
        for(int i=2;i<a;i++){
            if(a%i==0){
                System.out.println("composite number");
                break;
            }else System.out.println("Prime number"); break;
        }
    }

    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        prime(num);
    }
}
