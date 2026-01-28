package DAY23.FunctionalInterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Stu{
    int id;
    String name;
    int marks;
    Stu(int id,String name,int marks){
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return id+" "+name+" "+marks;
    }
}
public class marksSort {
    public static void main(String[] args) {
        List<Stu> list = new ArrayList<>(Arrays.asList(
                new Stu(101,"abhi",36),
                new Stu(102,"hello",60),
                new Stu(103,"world",44),
                new Stu(104,"heheh",54)

        ));
        list.sort((s1,s2)->Integer.compare(s1.marks,s2.marks));
        System.out.println(list);
    }
}
