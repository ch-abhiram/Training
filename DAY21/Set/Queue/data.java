package DAY21.Set.Queue;

import java.util.LinkedList;
import java.util.Queue;

public class data {
    public static void main(String[] args) {
        Queue q = new LinkedList();
        q.offer(10);
        q.offer("anna");
        q.offer('h');
        q.offer(true);

        System.out.println(q.peek());
        System.out.println(q.element());

        System.out.println(q.poll());
        System.out.println(q.remove());

        System.out.println(q.contains(true));
        System.out.println(q);
    }
}
