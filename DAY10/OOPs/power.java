package DAY10.OOPs;
class battery{
    private int capacity;
    battery(int capacity){
        this.capacity = capacity;
    }
}

class laptop{
    private String brand;
    private battery b;

    laptop(String brand,int capacity){
        this.brand = brand;
        this.b = new battery(capacity);
        System.out.println(brand+" "+capacity);
    }
}
public class power {
    static void main(String[] args) {
        laptop obj = new laptop("HP",90);
    }
}
