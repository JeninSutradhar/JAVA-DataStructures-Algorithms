// jeninsutradhar@gmail.com

import java.util.ArrayList;
import java.util.LinkedList;

/*
 * This code demonstrates:

Creating ArrayList and LinkedList to compare their performance.
Adding elements to both lists (1000000 integers in this case).
Measuring the time taken to access the first element of each list.
Printing the elapsed time for accessing the first element of each list.
 */

public class LinkedvsArrayList {

    public static void main(String[] args) {

        // Creating ArrayList and LinkedList to compare
        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();

        long startTime;
        long endTime;
        long elapsedTime;

        // Adding elements to both lists
        for (int i = 0; i < 1000000; i++) {
            linkedList.add(i); // Adding elements to LinkedList
            arrayList.add(i); // Adding elements to ArrayList
        }

        // **********Linked List**********
        // Start measuring time for accessing first element in LinkedList
        startTime = System.nanoTime();

        // Operations
        linkedList.get(0); // Accessing first element in LinkedList

        // Stop measuring time
        endTime = System.nanoTime();
        // Calculate elapsed time
        elapsedTime = endTime - startTime;
        // Print the elapsed time for accessing the first element in LinkedList
        System.out.println("Linked List:\t" + elapsedTime + "ns");

        
        
        // **********Array List**********
        // Start measuring time for accessing first element in ArrayList
        startTime = System.nanoTime();

        // Operations
        arrayList.get(0); // Accessing first element in ArrayList

        // Stop measuring time
        endTime = System.nanoTime();
        // Calculate elapsed time
        elapsedTime = endTime - startTime;
        // Print the elapsed time for accessing the first element in ArrayList
        System.out.println("Array List:\t" + elapsedTime + "ns");
    }
}
