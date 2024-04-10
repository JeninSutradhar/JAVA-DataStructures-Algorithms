// https://github.com/JeninSutradhar/JAVA-DataStructures-Algorithms

// Binary-Search Algorithm
/*
 Runtime Complexity => O(log n)
 * Search Algorithm that finds the Posotion of a target value within a sorted array
 * - half of the array is eliminated during each step
 * - Alway Begins from the Middle
*/
public class SimpleBinarySearch {

    public static void main(String[] args) {
        // Creating an array of integers
        int[] array = new int[100];

        // Target value to search for
        int target = 42;

        // Initializing the array with consecutive integers
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }

        // Performing binary search
        int index = binarySearch(array, target);

        // Printing the result
        if (index == -1) {
            System.out.println("Target not found");
        } else {
            System.out.println("Element found at index " + index);
        }
    }

    /**
     * Performs binary search on a sorted array of integers.
     *
     * @param array  The array to search in.
     * @param target The value to search for.
     * @return The index of the target value if found, -1 otherwise.
     */
    private static int binarySearch(int[] array, int target) {
        // Initializing lower and upper bounds for the search
        int low = 0;
        int high = array.length - 1;

        // Binary search algorithm
        while (low <= high) {
            int middle = low + (high - low) / 2; // Calculating the middle index
            int value = array[middle]; // Getting the value at the middle index

            // Printing the middle value (for debugging purposes)
            System.out.println("Middle value: " + value);

            // Comparing the middle value with the target
            if (value < target) {
                low = middle + 1; // If middle value is less than target, search the right half
            } else if (value > target) {
                high = middle - 1; // If middle value is greater than target, search the left half
            } else {
                return middle; // If middle value equals target, return the index
            }
        }

        return -1; // If target is not found, return -1
    }
}
