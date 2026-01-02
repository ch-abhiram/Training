package DAY4.Methods;

public class PR13 {
    static void eligible(int a){
        if(a>=18){
            System.out.println("eligible to vote");
        }else System.out.println("Not eligible to vote");
    }
    public static void main(String[] args){
        int age = 22;
        eligible(age);
    }
}
