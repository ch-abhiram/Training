package DAY16.ExceptionHandling;
class InsufficientBalanceException extends Exception{
    InsufficientBalanceException(String message){
        super(message);
    }
}

class bankaccount{
    private int balance = 10000;
    void withdraw(int withdrawl) throws InsufficientBalanceException{
            if(withdrawl>balance){
                throw new InsufficientBalanceException("Insufficent balance");
            }else {
                balance-=withdrawl;
            }
    }
}
public class PR1 {
    public static void main(String[] args) {
        bankaccount obj = new bankaccount();
        try{
            obj.withdraw(100000);
        }catch (InsufficientBalanceException e){
            System.out.println(e.getMessage());
        }
    }
}
