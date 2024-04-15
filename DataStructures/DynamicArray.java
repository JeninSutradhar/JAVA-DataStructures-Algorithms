// jeninsutradhar@gmail.com

// Dynamic Arrays :
/*
 * Dynamic Arrays have a flexible size (they can grow or shrink)
 * The size of Dynamic Array can be changed during runtime
 * Implemented Using Dynamic Memory Allocation
 * In Java, dynamic arrays are implemented using the ArrayList class, which is part of the java.util package
*/

import java.util.ArrayList;

public class DynamicArray {
    /*
     * Each ArrayList instance has a capacity. 
     * The capacity is the size of the array used to store the elements in the list. 
     * It is always at least as large as the list size
     */
    public static void main(String[] args) {
        
        ArrayList<String> list = new ArrayList<>();

        // adding Elements to Dynamic Array
        list.add("Rust");
        list.add("Kotlin");
        list.add("Javascript");
        list.add("dotnet");

        // Checking the Size
        int size = list.size(); 
        // Returns the number of elements in the list
        System.out.println(size);

        // Print Out the Elements
        System.out.println("Elements in the list: ");
        // Iterating Over the array List
        for (String Elements_in_list : list) {
            System.out.println(Elements_in_list);
        }

        list.remove(2); // Removes 'Javascript'
        System.out.println("Elements after removing index 1:");
        for (String element : list) {
            System.out.println(element);
        }
    }
}
/*
 * Disadvantages :
 * Wastes More Memory
 * Expanding / Shifthing Array/Elements is Time Consuming O(n) 
 */