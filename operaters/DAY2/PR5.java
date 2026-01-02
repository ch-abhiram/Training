package operaters.DAY2;

public class PR5 {
    public static void main(String[] args){
        int totalWorkingDays = 30;
        int workingDays = 26;
        double percetage = ((double)workingDays/totalWorkingDays)*100;
        String exam = workingDays>=25?"Eligible for exam":"Not eligible for exam";
        System.out.println("attendance percentage: "+percetage+" "+exam);
    }
}
