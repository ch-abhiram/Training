package DAY10.OOPs;

public class Marker {
    private int price;
    private String color;

    Marker setPrice(int price){
        this.price = price;
        return this;
    }
    Marker setColor(String color){
        this.color = color;
        return this;
    }
    public int getPrice(){
        return price;
    }
    public String getColor(){
        return color;
    }
    void dispaly(){
        System.out.println(price+" "+color);
    }

    static void main(String[] args) {
        Marker obj = new Marker();
        obj.setPrice(101).setColor("red").dispaly();
        int res = obj.setPrice(102).setColor("orange").getPrice();
        System.out.println(res);
        System.out.println(new Marker().setPrice(103).setColor("blue").getColor());
    }
}
