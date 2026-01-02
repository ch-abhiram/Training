package DAY7.Problems;

public class PR21Automorphic {
    static int len(int a){
        int len = 0;
        while (a!=0){
            a/=10;
            len++;
        }
        return len;
    }
    static int reverse(int a){
        int rev = 0;
        while (a!=0){
            int last = a%10;
            rev = rev*10+last;
            a/=10;
        }
        return rev;
    }
    static void Automorphic(int a){
        int num = a*a;
        int length = len(num);
        int rev = 0;
        for(int i = 0;i<length-1;i++){
            int last = num%10;
            rev = rev*10+last;
            num/=10;
        }
        int result = reverse(rev);
        if(result == a){
            System.out.println("it is a Automorphic number");
        }else System.out.println("It is not an Automorphic number");
    }

    static void main(String[] args) {
        int num = 25;
        Automorphic(num);
    }
}
