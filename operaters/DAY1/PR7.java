package operaters.DAY1;

public class PR7 {
    public static void main(String[] args){
        int stock = 9;
        boolean fastMoving = true;
        boolean notDiscontinued = true;
        String order = (stock>10 || fastMoving) && notDiscontinued?"Place Order":"Don't";
        System.out.println(order);
    }
}
