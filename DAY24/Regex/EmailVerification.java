package DAY24.Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailVerification {
    public static void main(String[] args) {
        String email = "java@gmail.com";
        String regex = "^[a-zA-Z0-9._]+@[a-z]+\\.com$";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(email);
        System.out.println(m.matches());
    }
}
