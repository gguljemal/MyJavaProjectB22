package day63_collections;

import java.util.*;

public class QueueExamples {

    public static void main(String[] args) {

        Queue<String> queue = new ArrayDeque<>();
        queue.add("one");
        queue.add("two");
        queue.add("three");
        queue.add("four");
        queue.add("five");

        System.out.println(queue.element());
        System.out.println(queue.peek());
        System.out.println(queue);

        System.out.println("queue.poll() = " + queue.poll());
        System.out.println("queue.remove() = " + queue.remove());
        System.out.println("final queue = " + queue);
        System.out.println(queue.peek());
        System.out.println(queue.element());



    }
}
