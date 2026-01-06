package DAY10.OOPs.Problems;
class customer{
    private String product;
    private int price;
    private int discount;
    private int quantity;

    customer setproduct(String product){
        this.product = product;
        return this;
    }
    customer setprice(int price){
        this.price = price;
        return this;
    }
    customer setdiscount(int discount){
        this.discount = discount;
        return this;
    }
    customer setquantity(int quantity){
        this.quantity = quantity;
        return this;
    }
    void generateBill(){
        int total = price*quantity;
        double Discount = (total*discount)/100;
        System.out.println("product "+product+" quantity "+quantity);
        System.out.println("total price after 20% discount "+(total-discount));


    }
}
public class PR1 {
    static void main(String[] args) {
        customer obj = new customer();
        obj.setproduct("rice").setprice(100).setdiscount(20).setquantity(4).generateBill();

    }
}
