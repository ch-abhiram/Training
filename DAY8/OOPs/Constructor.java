package DAY8.OOPs;

public class Constructor {
    Constructor() {
        System.out.println("from constructor");
    }

    public static void main(String[] args){
        System.out.println("main starts....!");
        Constructor obj = new Constructor();
        System.out.println("main ends....!");
    }
}
