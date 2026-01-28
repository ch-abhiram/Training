package DAY23.FunctionalInterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class stringlist {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("helalao","worlad","bye","world"));
        list.replaceAll(a->a.toUpperCase());
        System.out.println(list);
//        list.replaceAll(a->a.length()>3?a.substring(0,3):a);
//        System.out.println(list);
        list.replaceAll(a->a.replace("A","*"));
        System.out.println(list);
    }
}
