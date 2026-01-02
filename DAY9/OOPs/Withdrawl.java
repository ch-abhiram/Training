package DAY9.OOPs;

public class Withdrawl {
    private int balance = 1500000;
    public int get(){
        return balance;
    }
    public void set(int withdraw){
        if(withdraw>0 && balance>=15000){
            this.balance-=withdraw;
        }
    }

    static void main(String[] args) {
        Withdrawl obj = new Withdrawl();
        obj.set(10000);
        System.out.println(obj.get());
    }
}
