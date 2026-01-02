import java.util.Arrays;

public class Main{
    public static void main(String[] args){
        //Logical AND
        System.out.println('b'>='a' && 100>99);
        System.out.println('b'>='a' && 100>101);
        System.out.println( 100>99 && 'b'>='a');
//        if('b'>='a' && 100>99){
//            System.out.println("");
//        }

        //Logical OR
        System.out.println('b'>='a' || 100>99);
        System.out.println('b'>='a' || 100>101);
        System.out.println( 100==99 || 'b'=='a');
//        if(10>9 || 10<9){
//            System.out.println("OR");
//        }

        //Logical NOT
        System.out.println(!('b' >='a'));
        System.out.println(!('b' =='a'));

        String shoe = "puma";
        System.out.println(shoe!="puma" && shoe !="nike");
    }
}