package operaters.DAY2;

public class PR3 {
    public static void main(String[] args){
        int age = 25;
        int salary = 30000;
        int creditScore = 750;
        String loan = age>=21 && age<=60 && salary>25000 && creditScore>=700?"Eligible":"Not eligible";
        System.out.println(loan);

    }
}
