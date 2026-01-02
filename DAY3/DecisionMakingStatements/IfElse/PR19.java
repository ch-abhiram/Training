package DAY3.DecisionMakingStatements.IfElse;

import java.util.Scanner;
public class PR19 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int speed = scanner.nextInt();
        if(speed>120){
            System.out.println("License cancelled");
        } else if (speed>=90 && speed<=120) {
            System.out.println("Heavy fine");
        } else if (speed>=60  && speed<90) {
            System.out.println("Normal fine");
        }else {
            System.out.println("no fine");
        }
    }
}