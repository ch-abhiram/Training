package DAY19.Collections.List.ArrayList;

import java.util.ArrayList;

public class list {
    public static void main(String[] args) {
        ArrayList obj = new ArrayList<>();
        obj.add("hello");
        obj.add(1234);
        obj.add(23.948);
        obj.add('h');
        obj.add(true);
        System.out.println(obj);
        obj.remove(4);
        System.out.println(obj);
        obj.clear();
//        obj.removeAll(obj);
        System.out.println(obj);
    }
}
