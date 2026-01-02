package DAY7.Problems;

import java.util.Scanner;

public class PR5PerfectNo {
    static void perfect(int a){
        int sum = 0;
        for(int i = 1;i<a;i++){
            if(a%i==0){
                sum+=i;
            }
        }
        if(sum == a){
            System.out.println(a+" is a perfect number");
        }else System.out.println("not a perfect number");
    }

    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        perfect(num);
    }
}
