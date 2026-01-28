package DAY20.Stack;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack list = new Stack<>();
        list.push("hello");
        list.push(10);
        list.push(101);
        list.push("world");
        System.out.println(list.peek());
        Object pop = list.pop();
        System.out.println(pop);
        System.out.println(list);
        System.out.println(list.search(101));
    }
}
