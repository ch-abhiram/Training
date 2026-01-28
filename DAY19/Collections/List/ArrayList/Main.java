package DAY19.Collections.List.ArrayList;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList obj = new ArrayList();
        obj.add("hi");
        obj.add('a');
        obj.add(123);
        obj.add(123.0);
        obj.add(true);
        System.out.println(obj.size());

//        obj.remove(4);
        System.out.println(obj);
        obj.set(2,"yellooeo");

        ArrayList obj1 = new ArrayList();
        obj1.addAll(obj);
        obj1.add(3,"hello");
        System.out.println(obj1);

        //Generic
        ArrayList<Integer>  obj3 = new ArrayList<>();
        obj3.add(1);
        obj3.add(2);
        System.out.println(obj3);
    }
}
