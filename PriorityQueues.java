// jeninsutradhar@gmail.com
// created: 09 April 2024

// Priority Queue data Structure :
/*
 * A FIFI data Structure that serves elements
 * with the highest priorities(condition of being regarded or treated as more important than others) 
 * first before elements with Lower Priority
*/

import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueues {
    public static void main(String[] args) {

        // A string Priority Queue
        PriorityQueue<String> p_queue = new PriorityQueue<>();
        p_queue.offer("Hello");
        p_queue.offer("Welcome");
        p_queue.offer("Thankyou");
        p_queue.offer("Hi");

        // Converting to Array[] =>
        Object[] queueArray = p_queue.toArray();
        System.out.println("Priority queue converted to array: " + Arrays.toString(queueArray));

        // Dequeueing/ Printing until thw queue becomes Empty
        while (!p_queue.isEmpty()) {
            System.out.println(p_queue.poll()); // Elements are dequeued in priority order
        }

        // A double Priority Queue With Reversing Order
        Queue<Double> priQueue = new PriorityQueue<>(Collections.reverseOrder()); // Print IN Reverse Order
        priQueue.offer(4.0);
        priQueue.offer(7.0);
        priQueue.offer(9.0);
        priQueue.offer(2.0);

        while (!priQueue.isEmpty()) {
            System.out.println(priQueue.poll());
        }

        // A custom Priority Queue :
        // useful when the default ordering of elements does not match the desired
        // priority
        PriorityQueue<Integer> customPriorityQueue = new PriorityQueue<>((a, b) -> Integer.compare(b, a));

        // Custom comparator for reverse ordering
        customPriorityQueue.offer(5);
        customPriorityQueue.offer(3);
        customPriorityQueue.offer(7);

        while (!customPriorityQueue.isEmpty()) {
            System.out.println(customPriorityQueue.poll()); // Elements are dequeued in custom priority order
        }

        // A character Priority Queue
        Queue<Character> charQueue = new PriorityQueue<>();
        // Adding Characters
        charQueue.offer('a');
        charQueue.offer('c');
        charQueue.offer('b');
        charQueue.offer('d');
        while (!charQueue.isEmpty()) {
            System.out.println(charQueue.poll());
        }
    }
}
