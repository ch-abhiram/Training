package DAY9.OOPs;

public class Encapsulation {
    private int price;

    //setter method
    public void setPrice(int price){
        if(price>0){
            this.price=price;
        }
    }

    //getter method
    public int get(){
        return price;
    }

    static void main(String[] args) {
        Encapsulation obj = new Encapsulation();
        obj.setPrice(100);
        System.out.println(obj.get());
    }
}
