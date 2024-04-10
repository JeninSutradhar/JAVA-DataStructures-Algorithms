
package Sorting;
// SELECTION SORTING ALGORITHM
/*
* Selection sort is a simple and efficient sorting algorithm that 
* works by repeatedly selecting the smallest (or largest) element from the
* unsorted portion of the list and moving it to the sorted portion of the list.
*/

/**
 * SelectionSort
 * This class implements the selection sort algorithm to sort an array of integers.
 */
public class SelectionSort {

    /**
     * The main method initializes an array, sorts it using selection sort, and then prints the sorted array.
     * @param args The command-line arguments (not used in this example)
     */
    public static void main(String[] args) {
        // Initialize the array with unsorted elements
        int[] array = {9, 5, 7, 3, 7, 1, 5, 7, 3, 7, 2, 5, 7, 1};

        // Call selectionSort method to sort the array
        selectionSort(array);

        // Print the sorted array
        for (int i : array) {
            System.out.print(i + " ");
        }
    }

    /**
     * Sorts an array using the selection sort algorithm.
     * @param array The array to be sorted
     */
    private static void selectionSort(int[] array) {
        // Iterate through each element of the array
        for (int i = 0; i < array.length; i++) {
            // Assume the current index (i) as the index of the minimum element
            int min = i;
            
            // Find the index of the smallest element in the unsorted portion of the array
            for (int j = i; j < array.length; j++) {
                if (array[min] > array[j]) {
                    min = j; // Update the index of the minimum element
                }
            }

            // Swap the current element (at index i) with the smallest element found
            int temp = array[i];
            array[i] = array[min];
            array[min] = temp;
        }
    }
}
