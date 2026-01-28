package DAY20.comparable;

import java.util.ArrayList;
import java.util.Collections;

class emp implements Comparable<emp>{
    int cid;
    String name;

    emp(int cid,String name){
        this.cid = cid;
        this.name = name;
    }

    @Override
    public int compareTo(emp o) {
        return this.name.compareTo(o.name);
    }

    @Override
    public String toString() {
        return cid+" "+name;
    }
}
public class compareemp {
    public static void main(String[] args) {
        ArrayList<emp> list = new ArrayList<>();
        list.add(new emp(101,"huahhaaaa"));
        list.add(new emp(102,"abhi"));
        list.add(new emp(103,"abhi"));
        list.add(new emp(104,"ram"));
        Collections.sort(list);
        for(emp i: list){
            System.out.println(i);
        }
    }
}
