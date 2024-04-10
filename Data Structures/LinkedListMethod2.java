// jeninsutradhar@gmail.com

/*
 *  Simple Method for Linked List
 *  importing the LinkedList class from the java.util package and creating an instance
*/
import java.util.Arrays;
import java.util.LinkedList;

public class LinkedListMethod2 {
    public static void main(String[] args) {
        LinkedList<String> my_list = new LinkedList<String>();

        my_list.offer("A");
        my_list.offer("B");
        my_list.offer("C");
        my_list.offer("D");
        my_list.offer("F");

        // Accessing Elements
        System.out.println("Element at index 2: " + my_list.get(2));
        System.out.println("First element: " + my_list.getFirst());
        System.out.println("Last element: " + my_list.getLast());

        // Size and Empty Check
        System.out.println("Size of the list: " + my_list.size());
        System.out.println("Is the list empty? " + my_list.isEmpty());

        // Iterating Over the List
        System.out.println("Iterating over the list:");
        for (String element : my_list) {
            System.out.println(element);
        }

        // Checking if an Element Exists
        System.out.println("Does the list contain 'C'? " + my_list.contains("C"));

        // Copying List
        @SuppressWarnings("unchecked")
        LinkedList<String> copyList = (LinkedList<String>) my_list.clone();
        System.out.println("Copy of list: " + copyList);

        // Converting List to Array
        Object[] array = my_list.toArray();
        System.out.println("Array representation of the list: " + Arrays.toString(array));

        // Sublist Operations
        LinkedList<String> sublist = new LinkedList<>(my_list.subList(1, 3));
        System.out.println("Sublist from index 1 to 3: " + sublist);

        // Replacing Elements using set() ADT
        my_list.set(0, "Z");
        System.out.println("List after replacing first element with 'Z': " + my_list);

        // Searching for Elements
        System.out.println("Index of 'D': " + my_list.indexOf("D"));
        System.out.println("Last index of 'D': " + my_list.lastIndexOf("D"));

        // Adding Element 'E'
        my_list.add(4, "E");
        // [A, B, C, D, E, F]

        // Removing 'E'
        my_list.remove("E");
        // [A, B, C, D, F]

        // To remove the head/ First node(By default)
        // my_list.poll();

        // Clearing the List
        my_list.clear();
        System.out.println("List after clearing: " + my_list);

        System.out.println(my_list);
    }

    // USES :
    /*
     * implemeting stacks/ Queues
     * GPS navigation
     * music Playlist (Shruffling songs)
     */
}
