package operaters.DAY1;

public class PR6 {
    public static void main(String[] args){
        int speedLimit = 100;
        int speed = 120;
        int fineAmount = 1000;
        boolean emergency = false;
        boolean fine = speed>speedLimit && emergency;
        int totalFine = fine==false?fineAmount:0;
        System.out.println(totalFine);

    }
}
