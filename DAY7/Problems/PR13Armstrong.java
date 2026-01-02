package DAY7.Problems;

import java.util.Scanner;

public class PR13Armstrong {


    static void armstrong(int a){
        int sum = 0;
        int temp = a;
        while (a!=0){
            int last = a%10;
            int res = last*last*last;
            sum+=res;
            a/=10;
        }
        if(sum == temp){
            System.out.println("Its is an Armstrong number");
        }else System.out.println("Not an Armstrong number");
    }

    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        armstrong(num);
    }
}
