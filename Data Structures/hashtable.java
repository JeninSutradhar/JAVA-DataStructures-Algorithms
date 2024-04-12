// jeninsutradhar@gmail.com
// Hash Table Data Structure in Java
/*
* A hash table, also known as a hash map, is a fundamental data structure 
* that offers efficient insertion, deletion, and retrieval operations. 
* It utilizes a hashing function to map keys to indexes within an array, 
* allowing for constant-time access in ideal scenarios. Hash tables are commonly used 
* to store key-value pairs, providing a fast and effective way to associate data. 
* They are particularly useful in scenarios where quick lookups are required, 
* such as in implementing associative arrays, caching systems, and symbol tables. 
*/

import java.util.Hashtable;

public class hashtable {
    public static void main(String[] args) {
        // Creating a Hashtable with an initial capacity of 10
        Hashtable<Integer, String> table = new Hashtable<>(10);

        // Adding elements to the Hashtable
        table.put(100, "SpongeBob");
        table.put(123, "Patrick");
        table.put(199, "Harry");
        table.put(500, "Smith");
        table.put(777, "John");
        
        // Removing an element from the Hashtable
        table.remove(777);

        // Displaying the contents of the Hashtable
        for (Integer key : table.keySet()) {
            // Printing the hash bucket, key, and value for each entry
            System.out.println(key.hashCode() % 10 + "\t" + key + "\t" + table.get(key));
            // The hash bucket is calculated by taking the modulo of the key's hash code with the capacity of the Hashtable
        }

        // Example of retrieving a value
        int keyToRetrieve = 123;
        System.out.println("Value associated with key " + keyToRetrieve + ": " + table.get(keyToRetrieve));

        // Example of checking if a key exists
        int keyToCheck = 199;
        System.out.println("Does the key " + keyToCheck + " exist? " + table.containsKey(keyToCheck));

        // Example of replacing a value
        int keyToReplace = 100;
        table.put(keyToReplace, "Patrick Star");

        // Displaying the updated contents of the Hashtable
        System.out.println("Updated contents after replacing value:");
        for (Integer key : table.keySet()) {
            System.out.println(key.hashCode() % 10 + "\t" + key + "\t" + table.get(key));
        }
    }
}
