package DAY4.Methods;

public class PR5 {
    static int one(int a){
        return a;
    }
    static int one(int a,int b){
        return a+b;
    }
    public static void main(String[] args){
        int oneCost = 200;
        int twoCost = 500;
        System.out.println(one(oneCost));
        System.out.println(one(oneCost,twoCost));
    }
}
