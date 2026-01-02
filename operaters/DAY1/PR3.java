package operaters.DAY1;

public class PR3 {
    public static void main(String[] args){
        int performance = 5;
        int exp = 6;
        boolean dis = true;
        boolean emp = performance>4 || exp>5 && dis;
        String increment = emp?"Eligible":"Not eligible";
        System.out.println(increment);
    }
}
