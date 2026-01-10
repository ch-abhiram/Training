package DAY11.OOPs.Inheritance;

import java.util.Scanner;

class uber{

}
class mini extends uber{
    int price = 100;
}
class sedan extends uber{
    int price = 200;
}
class luxury extends uber{
    int price = 300;
}
public class cab {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int option = scanner.nextInt();
        int a = 9;
        double b = (double)a;
        uber u;
        switch (option){
            case 1:
                 u = new mini();
                 if(u instanceof mini){
                     mini m = (mini) u;
                     System.out.println(m.price);
                 }
                 break;
            case 2:
                u = new sedan();
                if(u instanceof sedan){
                    sedan s = (sedan) u;
                    System.out.println(s.price);
                }
                break;
            case 3:
                u = new luxury();
                if(u instanceof luxury){
                    luxury l = (luxury) u;
                    System.out.println(l.price);
                }
                break;
            default:
                System.out.println("invalid");
        }
    }
}
