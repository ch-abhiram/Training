package DAY13.Abstraction.PRAbstraction;
abstract class account{
    abstract double deposite(double amount);
    abstract double withdraw(double amount);
    abstract double calIntrest();
}

interface onlineBanking{
    void transferFunds(String bank, double amount);
    double checkBalance();
}


class sbi extends account implements onlineBanking{
    double balance = 1000;
    double intrest = 1.2;
    @Override
    double deposite(double amount) {
        return balance+amount;
    }

    @Override
    double withdraw(double amount) {
        if(balance >= amount){
            return balance-amount;
        }
        return 0;
    }

    @Override
    double calIntrest() {
        balance = balance*intrest;
        return balance;
    }

    @Override
    public void transferFunds(String bank, double amount) {
        if(balance>=amount){
            balance-=amount;
            System.out.println("the amount is transfered to "+bank + "amount "+amount);
        }
    }

    @Override
    public double checkBalance() {
        return balance;
    }
}
public class bank {
    public static void main(String[] args) {
        account acc = new sbi();   // abstraction
        acc.deposite(500);
        acc.withdraw(200);
        acc.calIntrest();

        onlineBanking ob = (onlineBanking)acc; // downcasting
        ob.transferFunds("HDFC", 300);
        System.out.println("Balance: " + ob.checkBalance());

    }
}
