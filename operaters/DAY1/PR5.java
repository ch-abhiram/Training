package operaters.DAY1;

public class PR5 {
    public static void main(String[] args){
        boolean physicalChallenged = true;
        int attendance = 64;
        boolean approval = true;
        String extraTime = (physicalChallenged || attendance<65) && approval?"Extra time":"No Extra time";
        System.out.println(extraTime);
    }
}
