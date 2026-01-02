package operaters.DAY2;

public class PR11 {
    public static void main(String[] args){
        int speed = 100;
        int speedLimit = 60;
        boolean seatBelt = true;
        int fine = 1000;
        int fineAmount = 0;
        boolean applyFine = speed>speedLimit && seatBelt;
        fineAmount = applyFine?fineAmount+fine:fineAmount;
        String msg = applyFine?"Fine applied":"Safe driving";
        System.out.println(msg+" "+fineAmount);
    }
}
