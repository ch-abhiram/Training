package DAY9.OOPs;

public class Bank {
    private int balance;
    public void set(int balance){
        if(balance>0){
            this.balance+=balance;
        }
    }
    public int get(){
        return balance;
    }

    static void main(String[] args) {
        Bank obj = new Bank();
        obj.set(1000);
        System.out.println(obj.get());
        obj.set(200);
        System.out.println(obj.get());
    }
}
