package DAY7.Problems;

import java.util.Scanner;

public class PR17SquareRoot {
    static void squareRoot(int a){
        int i = 1;
        while (i*i<=a){
            i++;
        }
        i--;
        if(i*i == a){
            System.out.println(i+" is the squareroot of "+a);
        }else System.out.println("no square root");
    }

    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        squareRoot(num);
    }
}
