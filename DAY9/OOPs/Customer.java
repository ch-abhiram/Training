package DAY9.OOPs;

public class Customer {
    private int id;
    private String name;
    Customer(int id,String name){
        this.id = id;
        this.name = name;
    }

    //method returning object reference
    public static Customer ret(){
        Customer c = new Customer(101,"huks");
        return c;
    }

    static void main(String[] args) {
        Customer c = ret();
        System.out.println(c.id);
        System.out.println(c.name);
    }
}
