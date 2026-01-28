package first.src.scenario.HotelBooking;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

public class HotelBooking {
    public static void validateUserDetails(int age,String mail,String creditcard) throws InvalidBookingDetailsException{
        //Age Validation
        if(age<18 || age>100){
            throw new InvalidBookingDetailsException("Invalid Age");
        }

        //Email Validation
        String EmailRegex = "^[a-zA-Z0-9._%+-]+@[a-z]+\\.com$";
        if(!mail.matches(EmailRegex)){
            throw new InvalidBookingDetailsException("Invalid Email Id");
        }
        //card verification
        if(!creditcard.matches("\\d{16}")){
            throw new InvalidBookingDetailsException("Invalid Credit Card");
        }


    }
    public static void validateBookingDetails(String hotelName, String roomType, LocalDate checkinDate,LocalDate checkoutDate) throws InvalidBookingDetailsException{
        List<String> hotel = Arrays.asList("Hilton", "Marriott", "Hyatt");
        //validate hotel
        if(!hotel.contains(hotelName)){
            throw new InvalidBookingDetailsException("Invalid Hotel Name");
        }
        //room type validation
        if(!(roomType.equals("Standard")
                || roomType.equals("Delux")
                || roomType.equals("Suite"))){
            throw new InvalidBookingDetailsException("Invalid room type");
        }

        //date validation
        if(checkinDate.isBefore(LocalDate.now())){
            throw new InvalidBookingDetailsException("Invalid check-in date");
        }

        if(!checkoutDate.isAfter(checkinDate)){
            throw new InvalidBookingDetailsException("Invalid check-out date");
        }
    }
    public static double calculateBookingCost(String roomType,int numDays,boolean breakfastIncluded){
        double ratePerDay = 0;

        switch (roomType){
            case "Standard":
                ratePerDay = 1000;
                break;
            case "Delux":
                ratePerDay = 2000;
                break;
            case "Suite":
                ratePerDay = 3000;
                break;
        }
        double totalCost = ratePerDay*numDays;

        if(breakfastIncluded){
            totalCost += 100*numDays;
        }
        return totalCost;
    }
}
