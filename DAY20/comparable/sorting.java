package DAY20.comparable;

import java.util.ArrayList;
import java.util.Collections;

class choco implements Comparable<choco>{
    int cid;
    String cname;
    int price;

    choco(int cid, String cname,int price){
        this.cid = cid;
        this.cname = cname;
        this.price = price;
    }

    @Override
    public int compareTo(choco o) {
        return this.cid - o.cid;
    }

    @Override
    public String toString() {
        return cid+" "+cname+" "+price;
    }
}
public class sorting {
    public static void main(String[] args) {
        ArrayList<choco> list = new ArrayList<>();
        list.add(new choco(10,"5-star",20));
        list.add(new choco(20,"kit-kat",50));
        list.add(new choco(70,"diary-milk",210));
        list.add(new choco(40,"mango",1));
        list.add(new choco( 50,"milky-bar",50));
        for(choco i:list){
            System.out.println(i);
        }

        Collections.sort(list);
        System.out.println("*****************");
        for(choco i: list){
            System.out.println(i);
        }
    }
}
