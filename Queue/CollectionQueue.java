package Queue;

import java.util.*;

public class CollectionQueue {
    public static void main(String[] args) {
        // Queue l = new Queue();
        // Queue<Integer> l = new LinkedList<>();
        Queue<Integer> l = new ArrayDeque<>();

        l.add(1);
        l.add(2);
        l.add(3);
        l.add(4);
        l.add(5);
        System.out.println(l.remove());
        l.add(6);
        System.out.println(l.peek());
        l.add(7);
        while (!l.isEmpty()) {
            System.out.println(l.peek());
            l.remove();
        }

    }

}
