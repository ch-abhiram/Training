package DAY23.FunctionalInterface;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class example {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("hello","world","neni","ni");
//        for(String i: list){
//            System.out.println(i);
//        }
        list.forEach(i-> System.out.println(i));
        System.out.println("***************************");
        Collections.sort(list,(a,b)->a.compareTo(b));
        list.forEach(i->System.out.println(i));
    }
}
