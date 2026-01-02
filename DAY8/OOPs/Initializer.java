package DAY8.OOPs;

public class Initializer {
    {
        System.out.println("hello 1");
    }
    {
        System.out.println("hello 2");
    }
    public static void main(String[] args){
        Initializer obj = new Initializer();
        System.out.println("hello main");
    }
}
