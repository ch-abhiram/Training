package DAY21.Set.HashSet;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

class teacher implements Comparable<teacher>{
    int tid;
    String name;

    teacher(int sid,String name){
        this.tid = sid;
        this.name = name;
    }

    @Override
    public int compareTo(teacher o) {
        return this.name.compareTo(o.name);
    }

    @Override
    public String toString() {
        return tid+" "+name;
    }
}
public class Teachersort {
    public static void main(String[] args) {
        Set<teacher> set = new HashSet<>();
        set.add(new teacher(101,"pichi"));
        set.add(new teacher(102,"akka"));
        set.add(new teacher(103,"peddateacher"));
        set.add(new teacher(104,"akkko"));
        ArrayList ar = new ArrayList<>(set);
        Collections.sort(ar);
        for(Object i: ar){
            System.out.println(i);
        }
    }
}
