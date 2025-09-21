
// Demonstrates basic operations with Queue using PriorityQueue in Java
import java.util.*;

public class QueueDemo {
    public static void main(String[] args) {
        // Creating a queue (PriorityQueue by default sorts elements in natural order)
        Queue<Integer> queue = new PriorityQueue<>();

        // Adding elements
        queue.add(30);
        queue.add(10);
        queue.add(50);
        queue.add(20);

        System.out.println("Initial Queue: " + queue);

        // Removing element (poll - removes head of the queue)
        System.out.println("Removed element (poll): " + queue.poll());
        System.out.println("Queue after poll: " + queue);

        // Viewing head element
        System.out.println("Head element (peek): " + queue.peek());

        // Checking if queue contains an element
        System.out.println("Contains 20? " + queue.contains(20));

        // Iterating through queue
        System.out.println("Iterating Queue:");
        for (int num : queue) {
            System.out.println(num);
        }
    }
}
