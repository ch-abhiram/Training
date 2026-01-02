package DAY7.Problems;

import java.util.Scanner;

public class PR16SpyNumber {
    static void spy(int a){
        int sum = 0;
        int product = 1;
        while(a!=0){
            int last = a%10;
            sum+=last;
            product*=last;
            a/=10;
        }
        if(sum == product){
            System.out.println("it is a spy number");
        }else System.out.println("not a spy number");
    }

    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        spy(num);
    }
}
