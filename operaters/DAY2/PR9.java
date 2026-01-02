package operaters.DAY2;

import java.security.PublicKey;

public class PR9 {
    public static void main(String[] args){
        int marks = 92;
        int income = 200000;
        boolean sportsOrNcc = true;
        String eligible = marks>=85 && income<300000 && sportsOrNcc?"Eligible":"Not Eligible";
        System.out.println(eligible);
    }
}
