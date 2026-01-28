package DAY23.FunctionalInterface;

import java.util.*;

public class map {
    public static void main(String[] args) {
        Map<Integer,String> obj = new HashMap<>();
        obj.put(101,"Dinga");
        obj.put(102,"gaga");
        obj.put(103,"cheajsdb");
        obj.forEach((i,j)-> System.out.println(i+" "+j));

        List<Integer> list = new ArrayList(Arrays.asList(100,20,3,140,5));
        list.add(1325);
        list.sort((a,b)->a-b);
        list.forEach(i-> System.out.println(i));
        System.out.println(list.size());
        System.out.println("************************");;
//        list.replaceAll(a->a*3);
        list.replaceAll(a->a%2==0?0:a);
        list.forEach(i-> System.out.println(i));
        list.removeIf(a->a%2==0);


        System.out.println("************************");
        list.forEach(i-> System.out.println(i));

    }
}
