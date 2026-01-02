package DAY7.Problems;

import java.util.Scanner;

public class PR9CompositeRange {
    static void composite(int a,int b){
        for(int i = a;i<=b;i++){
            if(i<1) continue;
            boolean iscomposite = false;
            for(int j=2;j<=i/2;j++){
                if(i%j == 0){
                    iscomposite  = true;
                    break;
                }
            }
            if(iscomposite){
                System.out.println(i+" is a composite number");
            }
        }

    }


    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        composite(a,b);
    }
}
