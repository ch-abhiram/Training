package first.src.M1.StringManipulation;

import java.util.Map;

import java.util.stream.Collectors;

public class PrStreams {
    static void main(String[] args) {
        String s = "Hello";
        Map<Object,Long> res = s.chars().mapToObj(i -> (char) i).collect(Collectors.groupingBy(c -> c, Collectors.counting()));
        System.out.println(res);
    }
}
