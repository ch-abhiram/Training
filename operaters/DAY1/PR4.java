package operaters.DAY1;

public class PR4 {
    public static void main(String[] args){
        int purchaseAmount = 5500;
        boolean premimumCustomer = true;
        String discount = purchaseAmount>2000 && premimumCustomer?"Eligible":"Not Eligible";
        System.out.println(discount);
    }
}
