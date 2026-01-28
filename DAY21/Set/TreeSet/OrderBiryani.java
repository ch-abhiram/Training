package DAY21.Set.TreeSet;

import java.util.Collections;
import java.util.Comparator;
import java.util.TreeSet;

class Biryani{
    int id;
    String name;
    int price;
    Biryani(int id,String name,int price){
        this.id = id;
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return id+" "+name+" "+price;
    }
}

class CompareBiryani implements Comparator<Biryani>{
    @Override
    public int compare(Biryani o1, Biryani o2) {
//        int Compare = Integer.compare(o1.price,o2.price);
        int Compare = Integer.compare(o1.id,o2.id);
//        if(Compare == 0){
//            return o1.name.compareTo(o2.name);
//        }
        return Compare;
    }
}
public class OrderBiryani {
    public static void main(String[] args) {
        TreeSet<Biryani> set = new TreeSet<>(new CompareBiryani());
        set.add(new Biryani(101,"single chicken biryani",140));
        set.add(new Biryani(102,"full chicken biryani",200));
        set.add(new Biryani(103,"single Gosh biryani",200));
        set.add(new Biryani(102,"Gosh biryani",260));
        set.add(new Biryani(105,"fry biryani",140));

        for(Object i: set){
            System.out.println(i);
        }
    }
}
