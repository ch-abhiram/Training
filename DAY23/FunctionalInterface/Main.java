package DAY23.FunctionalInterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

class Hero{
    String name;
    static int square(int a){
        return a*a;
    }
    int add(int a, int b){
        return a+b;
    }
    Hero(){
        System.out.println("hellooooooooooooooo");
    }
    Hero(String name){
        System.out.println(name);
    }
    void display(String name){
        System.out.println(name);
    }
    public static void main(String[] args) {
//        List<Integer> list = new ArrayList<>(Arrays.asList(3,4,2));
//        list.forEach(i-> System.out.println(i));
//        System.out.println("*****************************");
//        list.forEach(i-> System.out.println(Hero.square((Integer) i)));
//        System.out.println("*****************************");
//        list.forEach(Hero::square);
//        System.out.println("*****************************");
//        Hero obj = new Hero();
//        list.forEach(i-> System.out.println(obj.add(i,2)));

        Function<String,Hero> obj1 = Hero::new;
        obj1.apply("hello");

    }


}
public class Main {

}
