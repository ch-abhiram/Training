package operaters.DAY1;

public class PR10 {
    public static void main(String[] args){
        int points = 1000;
        boolean levelComplete = true;
        boolean noCheat = true;
        boolean bonus = points>100 && levelComplete && noCheat;
        points = bonus?points+100:points;
        System.out.println(points);

    }
}
