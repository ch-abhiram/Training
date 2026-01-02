package operaters.DAY2;

public class PR2 {
    public static void main(String[] args){
        double price = 4000;
        boolean memberShip = true;
        boolean discount = price>3000 || memberShip;
        price = discount?price-(price*0.2):price;
        String elgible = discount?"20% disount applied":"no disount";
        System.out.println(elgible+" total price "+price);
    }
}
