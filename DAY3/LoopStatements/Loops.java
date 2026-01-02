package DAY3.LoopStatements;

public class Loops {
    public static void main(String[] args){
        int num = 5;
        while (num>=0){
            System.out.println(num);
            num--;
        }
        int num1 = 5;
        for(int i=0;i<=num1;i++){
            System.out.println(i);
        }
        int num2 = 5;
        do{
            System.out.println(num2);
            num2--;
        }while (num2>=0);
    }
}
