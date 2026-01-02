package DAY3.LoopStatements;

public class PRASCII {
    public static void main(String[] args){
        for(char i='a';i<='z';i++){
            if(i%2==0){
                int no = (int) i;
                System.out.println(i+" -> "+no);
            }
        }
    }
}
