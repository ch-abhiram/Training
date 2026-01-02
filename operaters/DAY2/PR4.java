package operaters.DAY2;

public class PR4 {
    public static void main(String[] args){
        double dataLimit = 2.0;
        double dataUsage = 1.8;
        double percentage = (dataUsage/dataLimit)*100;
        String alert = percentage>=90?"90% data consumed":" ";
        System.out.println(alert);
    }
}
