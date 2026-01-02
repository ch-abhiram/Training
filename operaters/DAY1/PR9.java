package operaters.DAY1;

public class PR9 {
    public static void main(String[] args){
        int consumed = 350;
        int maxconsumed = 300;
        boolean commercial  = true;
        int tax = 100;
        int totalAmount = 0;
        totalAmount = consumed<maxconsumed || commercial? 13*consumed+tax: 10*consumed+tax;
        System.out.println(totalAmount);

    }
}
