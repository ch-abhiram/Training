package DAY3.DecisionMakingStatements.IfElse;

public class PR10 {
    public static void main(String[] args){
        int attendance = 62;
        if(attendance>=60 && attendance<=74){
            System.out.println("light fine");
        }else if(attendance<60){
            System.out.println("heavy fine");
        }else {
            System.out.println("no fine");
        }
    }
}
