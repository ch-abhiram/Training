package first.src.scenario.HotelBooking;

public class InvalidBookingDetailsException extends Exception{
    InvalidBookingDetailsException(String message){
        super(message);
    }
}
