package DAY7.Problems;

import java.util.Scanner;

public class PR18Sunny {
    static void sunny(int a){
        int i = 1;
        int num = a+1;
        while (i*i<=num){
            i++;
        }
        i--;
        if(i*i == num){
            System.out.println("it is a sunny number");
        }else System.out.println("it is not a sunny number");
    }

    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        sunny(num);
    }
}
