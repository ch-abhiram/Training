package DAY4.Loop_PR;
import java.util.Scanner;
public class PR12 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int sum=0;
        for(int i=1;i<=5;i++){
            System.out.print("Enter marks of student subject "+i+" : ");
            int marks = scanner.nextInt();
            sum+=marks;
        }
        System.out.println("Total marks: "+sum);
        scanner.close();
    }
}
