package DAY16.ExceptionHandling;
class SeatNotAvailableException extends Exception{
    SeatNotAvailableException(String msg){
        super(msg);
    }
}

class InvalidPassportException extends Exception{
    InvalidPassportException(String msg){
        super(msg);
    }
}
class CheckInClosedException extends Exception{
    CheckInClosedException(String msg){
        super(msg);
    }
}
class Airport{
    int seats = 100;
    void seatbook(int noseats) throws SeatNotAvailableException{
        if(noseats>seats){
            throw new SeatNotAvailableException("Seats not avaliable");
        }else {
            System.out.println("booking done");
        }
    }

    void checkIn(boolean checkin) throws CheckInClosedException{
        if(!checkin){
            throw new CheckInClosedException("check In closed");
        }
    }

    void passport(boolean pass) throws InvalidPassportException{
        if(!pass){
            throw new InvalidPassportException("invalid passport");
        }else {
            System.out.println("passport check done");
        }
    }
}
public class PR6 {
    public static void main(String[] args) {
        Airport obj = new Airport();
        try {
            obj.seatbook(12);
            obj.passport(true);
            obj.checkIn(false);
        }catch (InvalidPassportException | CheckInClosedException | SeatNotAvailableException e){
            System.out.println(e.getMessage());
        }
    }
}
