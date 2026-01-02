package DAY8.OOPs;

import java.util.Scanner;

public class EmpDriver {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Employee e1 = new Employee();
        for(int i = 0;i<5;i++){
            System.out.print("Enter eid: ");
            e1.eid = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Enter Employee name: ");
            e1.Ename = scanner.nextLine();
            e1.display();
        }
    }

}
