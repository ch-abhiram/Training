package operaters.DAY1;

public class PR1 {
    public static void main(String[] args){
        int marks = 45;
        int attendance = 76;
        boolean result = marks>=40 && attendance>75;
        String res = result?"Pass":"Fail";
        marks = result?marks+5:marks;
        System.out.println(res +" "+ marks);
    }
}
