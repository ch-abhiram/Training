package operaters.DAY2;

public class PR7 {
    public static void main(String[] args){
        double price = 250;
        int age = 11;
        boolean eligible = age<12 || age>60;
        price = eligible?price*0.7:price;
        String disount = eligible?"30% discount":"no discount";
        System.out.println(disount+" total price: "+price);
    }
}
