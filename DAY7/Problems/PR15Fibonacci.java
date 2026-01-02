package DAY7.Problems;

public class PR15Fibonacci {
    static void Fibonacci(int n){
        int a = 0;
        int b = 1;
        while(n!=0){
            int c = a+b;
            System.out.print(a+" ");
            a=b;
            b=c;
            n--;
        }
    }

    static void main(String[] args) {
        int num = 5;
        Fibonacci(num);
    }
}
