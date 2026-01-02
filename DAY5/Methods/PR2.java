package DAY5.Methods;

public class PR2 {
    static void evenSum(){
        int sum = 0;
        for(int i = 0;i<=10;i++){
            if(i%2==0){
                sum+=i;
            }
        }
        System.out.println("Sum of first 10 even no : "+sum);
    }
    public static void main(String[] args){
        evenSum();
    }
}
