package DAY23.Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class strea {
    public static void main(String[] args) {
//        int[] arr = {1,2,3,4,5,6,7,8};
//        Arrays.stream(arr).filter(i->i%2!=0).forEach(System.out::println);
        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,2,15,3,34,35,453,3543));
//        list.stream().filter(i->i%3==0 && i%5==0)
//                .forEach(System.out::println);
        list.stream()
                .filter(i->i%2!=0)
                .map(i->i*i)
                .forEach(System.out::println);

        List<String> list1 = new ArrayList<>(Arrays.asList("hello","world","wow","print"));
//        list1.stream().filter(i->i.startsWith("w"))
//                .forEach(System.out::println);
//        list1.stream().map(i->i.toUpperCase())
//                .forEach(System.out::println);
        list1.stream().filter(i->i.length()>3)
                .forEach(System.out::println);
    }
}
