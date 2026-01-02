package operaters.DAY1;

public class PR2 {
    public static void main(String[] args){
        int balance = 100;
        boolean active = true;
        int withdraw = 20;
        balance = balance>0 && active?balance-withdraw:balance;
        System.out.println(balance);

    }
}
