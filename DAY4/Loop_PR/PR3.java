package DAY4.Loop_PR;
import java.util.Scanner;
public class PR3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int sum = 0;
        while (num != 0) {
            int no = num % 10;
            sum += no;
            num /= 10;
        }
        System.out.println(sum);
    }

}
