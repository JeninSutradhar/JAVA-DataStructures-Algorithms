// jeninsutradhar@gmail.com
// created: 09 April 2024

// The Queue Data Structure
// works on FIFO = First-in First-Out
// Designed for Holding Elements Prior to Processing Linear Data search

import java.util.Queue;
import java.util.LinkedList;

public class Queues {
    /*
     * add = enqueue=> offer()
     * remove = dequeue=> poll()
     */
    public static void main(String[] args) {

        Queue<String> my_queue = new LinkedList<String>();

        my_queue.offer("Karen");
        my_queue.offer("Chad");
        my_queue.offer("John");
        my_queue.offer("steve");

        // Peek: Look at the First Element
        System.out.println(my_queue.peek());

        // Check the Size
        int size = my_queue.size();
        System.out.println("Size of queue: " + size);

        // Checking if An Element Exists
        boolean checkElement = my_queue.contains("John");
        System.out.println("Does the queue contains 'John'? : " + checkElement);

        // Poll: Remove an Element
        my_queue.poll();
        my_queue.poll();
        // We can ALSO use element() but it Can Throw Some Exceptions/Errors
        my_queue.element();

        // Check if the Queue is Empty
        System.out.println("isEmpty: " + my_queue.isEmpty());

        System.out.println(my_queue);

        // Clear the queue
        my_queue.clear();
        System.out.println("Queue after Cleared: " + my_queue);

    }
}