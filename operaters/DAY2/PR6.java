package operaters.DAY2;

public class PR6 {
    public static void main(String[] args){
        int weight = 460;
        int quantity = 9;
        String eligible = weight>=450 && weight<=550 && quantity>=8?"Accepted":"Rejected";
        System.out.println(eligible);
    }
}
