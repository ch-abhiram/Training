package DAY4.Methods;
import java.util.Scanner;
public class PR2 {
    static void student(String name){
        System.out.println(name);
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter student name: ");
        String name = scanner.nextLine();
        student(name);
    }
}
