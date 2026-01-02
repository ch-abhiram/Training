package operaters.DAY2;

public class PR10 {
    public static void main(String[] args){
        double bill = 1000;
        int noPeople = 4;
        bill = bill+(bill*0.18);
        double perPerson = bill/noPeople;
        System.out.println("total bill "+bill+" bill per person "+perPerson);
    }
}
