package DAY10.OOPs.Problems;
class Phone{
    private String name;
    private int price;
    private String color;
    private boolean warrent;

    Phone setName(String name){
        this.name = name;
        return this;
    }
    Phone setPrice(int price){
        this.price = price;
        return this;
    }
    Phone setColor(String color){
        this.color = color;
        return this;
    }
    Phone setWarrent(boolean warrent){
        this.warrent = warrent;
        return this;
    }
    void display(){
        System.out.println(name+" "+price+" "+color+" "+warrent);
    }
}
public class PR3 {
    static void main(String[] args) {
        new Phone().setName("iphone").setColor("black").setPrice(1000).setWarrent(true).display();

    }
}
