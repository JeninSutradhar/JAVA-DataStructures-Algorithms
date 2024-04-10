// jeninsutradhar@gmail.com
// https://github.com/JeninSutradhar/JAVA-DataStructures-Algorithms

// Linear Search Algorithm
/*
 * Linear Search: Iterate through a Collection One Element at a time
 *                  
 *                Runtime Complexity = O(n)
 *              - Fast for searches of small-medium Data Sets
 *              - Does not need to be Sorted
 *              - Useful for linked Lists
 */
public class LinearSearch {

    public static void main(String[] args) {

        // Integer array
        int[] intArray = { 1, 5, 7, 4, 7, 9, 32, 6, 12, 7, 9, 0, 23, 2 };
        int intValue = 9;
        int intIndex = linearSearch(intArray, intValue);

        // Print results for integer search
        if (intIndex != -1) {
            System.out.println("Integer Element Found At Index: " + intIndex);
        } else {
            System.out.println("Integer Search Failed! [Error: Element not Found]");
        }


        // String array
        String[] stringArray = { "Java", "Python", "C++", "JavaScript", "Ruby", "C", "Rust", "Typescript" };
        String stringValue = "Rust";
        int stringIndex = linearSearch(stringArray, stringValue);

        // Print results for string search
        if (stringIndex != -1) {
            System.out.println("String Element Found At Index: " + stringIndex);
        } else {
            System.out.println("String Search Failed! [Error: Element not Found]");
        }
    }

    /**
     * Performs a linear search on an array of integers.
     *
     * @param array The array to search.
     * @param value The value to search for.
     * @return The index of the value if found, -1 otherwise.
     */
    private static int linearSearch(int[] array, int value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                return i;
            }
        }
        return -1;
    }

    /**
     * Performs a linear search on an array of strings.
     *
     * @param array The array to search.
     * @param value The value to search for.
     * @return The index of the value if found, -1 otherwise.
     */
    private static int linearSearch(String[] array, String value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(value)) {
                return i;
            }
        }
        return -1;
    }
}
