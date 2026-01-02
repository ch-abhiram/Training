package operaters.DAY2;

public class PR12 {
    public static void main(String[] args){
        int age = 26;
        boolean noSmoking = true;
        boolean noDrinking = true;
        int healthScore = 10;
        String eligible = age>=25 && noSmoking && noDrinking && healthScore>=8?"Eligible for insurance":"Not Eligible";
        System.out.println(eligible);
    }
}
