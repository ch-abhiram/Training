package DAY4.Methods;

public class PR6 {
    static int base(int a){
        return a;
    }
    static int bonus(int a, int b){
        return a+b;
    }
    public static void main(String[] args){
        System.out.println("basic salary: "+base(10000));
        System.out.println("salary after bonus: "+bonus(base(10000),1000));
    }
}
