package operaters.DAY1;

public class Conditonal_Operator {
    public static void main(String[] args){
        //value Boolean
        System.out.println(10==10?true:false);
        boolean res = 11>12?true:false;
        System.out.println(res);
        //exp
        int a = 10;
        int b =15;
        int sub = a>b?a-b:b-a;
        System.out.println(sub);
        //var
        int gre = a>b?a:b;
        System.out.println(gre);
        //value String
        String eligible = a>18?"eligible":"notEligible";
        System.out.println(eligible);

    }
}
