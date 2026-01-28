package first.src.scenario.HotelBooking;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class UserInterface {
    public static void main(String[] args) throws InvalidBookingDetailsException {
        Scanner scanner = new Scanner(System.in);

        try{
            System.out.print("Enter your name: ");
            String name = scanner.nextLine();

            System.out.print("\nEnter your age: ");
            int age = Integer.parseInt(scanner.nextLine());

            System.out.print("\nEnter your EmailId: ");
            String emailId = scanner.nextLine();

            System.out.print("\nEnter your creditCardNo: ");
            String creditcard = scanner.nextLine();

            HotelBooking.validateUserDetails(age,emailId,creditcard);

            System.out.print("\nEnter Hotel Name: ");
            String hotelName = scanner.nextLine();

            System.out.print("\nSelect Room Type: ");
            String roomType = scanner.nextLine();

            System.out.print("\nEnter checkIn Date (yyyy-mm-dd): ");
            String checkin = scanner.nextLine();

            System.out.print("\nEnter checkOut Date (yyyy-mm-dd): ");
            String checkout = scanner.nextLine();

            LocalDate checkInDate;
            LocalDate checkOutDate;

            try{
                checkInDate = LocalDate.parse(checkin);
                checkOutDate = LocalDate.parse(checkout);
            }catch (Exception e){
                throw new InvalidBookingDetailsException("Invalid Date format");
            }

            HotelBooking.validateBookingDetails(hotelName,roomType,checkInDate,checkOutDate);

            int nights = (int) ChronoUnit.DAYS.between(checkInDate, checkOutDate);

            // Assume breakfast included
            boolean breakfastIncluded = true;

            double totalCost =
                    HotelBooking.calculateBookingCost(roomType, nights, breakfastIncluded);

            System.out.println("Total Booking Cost: $" + totalCost);

        } catch (InvalidBookingDetailsException e) {
            System.out.println(e.getMessage());
        }

        scanner.close();


    }
}
