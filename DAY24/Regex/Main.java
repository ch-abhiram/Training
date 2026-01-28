package DAY24.Regex;

import javax.xml.transform.Source;
import java.util.regex.Matcher;

public class Main {
    public static void main(String[] args) {
        String s = "java";
//        System.out.println("Dingaa".matches("[kDa]ingaa"));
        System.out.println(s.matches("^[a-z]+$"));
        System.out.println("Haai".matches("H.i"));
        System.out.println(s.matches("j[a-z]va"));
        System.out.println("7".matches("\\d"));
        System.out.println("_".matches("\\w"));
        System.out.println(" ".matches("\\s"));
        System.out.println("hha".matches("h*"));
    }

}
