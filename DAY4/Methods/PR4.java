package DAY4.Methods;

public class PR4 {
    static int bank(int a, int b){
        return a+b;
    }
    public static void main(String[] args){
        int balance = 1000;
        int deposit = 200;
        System.out.println(bank(balance,deposit));
    }
}
