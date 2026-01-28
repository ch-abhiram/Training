package DAY22.Map;

import java.util.HashMap;
import java.util.Map;

public class map {
    public static void main(String[] args) {
        Map<Integer,String> m = new HashMap<>();
        m.put(101,"hello");
        m.put(102,"heheheh");
        m.put(103,"haayaaa");
        m.put(103,"gasdhasda");
        m.put(104,"hello");
        m.put(105,"lolololoo");

        System.out.println(m.get(104));
        System.out.println(m.containsKey(105));
        System.out.println(m.remove(105));
        System.out.println(m.keySet());
        System.out.println(m.values());
        System.out.println(m.entrySet());
    }
}
