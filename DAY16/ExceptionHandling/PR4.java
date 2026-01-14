package DAY16.ExceptionHandling;
class InsufficientbalanceExceptionn extends Exception{
    InsufficientbalanceExceptionn(String msg){
        super(msg);
    }
}
class InvalidPinException extends Exception{
    InvalidPinException(String msg){
        super(msg);
    }
}
class ATMOutOfCashException extends Exception{
    ATMOutOfCashException(String msg){
        super(msg);
    }
}

class ATM{
    int balance = 10000;
    static int AtmCash = 20000;
    private static int pin = 1234;

    void validate(int pinNo) throws InvalidPinException{
        if(pinNo != pin){
            throw new InvalidPinException("invalid pin");
        }else {
            System.out.println("login done");
        }
    }

    void withdraw(int withdrawl) throws InsufficientBalanceException{
        if(withdrawl>balance){
            throw new InsufficientBalanceException("Insufficient balance");
        }else {
            System.out.println("Transcation completed");
            balance-=withdrawl;
        }
    }

    void Atmwithdraw(int cash) throws ATMOutOfCashException{
        if(cash>AtmCash){
            throw new ATMOutOfCashException("No cash");
        }else {
            AtmCash-=cash;
            System.out.println("collect your Amount "+cash);
        }
    }

}
public class PR4 {
    public static void main(String[] args) {
        ATM obj = new ATM();
        try{
            obj.validate(1234);
            obj.Atmwithdraw(120000);
            obj.withdraw(120000);
        }catch (InsufficientBalanceException | ATMOutOfCashException | InvalidPinException e){
            System.out.println(e.getMessage());
        }

    }
}
