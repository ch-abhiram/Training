package first.src.M1.String;

import javax.xml.transform.Source;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserValidation {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String user = sc.nextLine();

        String regex = "^[a-zA-z]+[a-zA-z_0-9]*$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(user);

        if(matcher.matches()){
            System.out.println("correct");
        }else {
            System.out.println("wrong");
        }
    }
}
