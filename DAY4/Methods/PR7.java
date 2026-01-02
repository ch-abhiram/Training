package DAY4.Methods;

public class PR7 {
    static int totalBalance(int a,int b){
        return a-b;
    }
    public static void main(String[] args){
        int balance = 1000;
        int withdraw = 200;
        int result = totalBalance(balance,withdraw);
        System.out.println("balance: "+result);
    }
}
