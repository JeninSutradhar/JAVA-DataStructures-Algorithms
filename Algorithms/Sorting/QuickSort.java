// https://github.com/JeninSutradhar/JAVA-DataStructures-Algorithms

// Q U I C K - S O R T
/* FASTEST **
 * Quick Sort is a highly efficient sorting algorithm 
 * that divides an array into smaller sub-arrays based on 
 * a chosen pivot element, then recursively sorts these sub-arrays. 
 * It follows the Divide and Conquer approach.
*/

public class QuickSort {
    public static void main(String[] args) {

        // Array to be sorted
        int[] array = { 8, 2, 5, 3, 9, 4, 7, 6, 1 };

        // Sorting the array using Quick Sort
        quickSort(array, 0, array.length - 1);

        for (int i : array) {
            // Printing the sorted array
            System.out.print(i + " ");
        }
    }

    // Recursive method to perform Quick Sort
    private static void quickSort(int[] array, int start, int end) {

        // Base Case: If the array has one or fewer elements => return
        if (end <= start) {
            return;
        }

        // Partition the array and get the pivot index
        int pivot = partition(array, start, end);

        // Recursively sort the left and right sub-arrays
        quickSort(array, start, pivot - 1);
        quickSort(array, pivot + 1, end);
    }

    // Method to partition the array
    private static int partition(int[] array, int start, int end) {

        // Selecting the pivot element
        int pivot = array[end];
        int i = start - 1;

        // Iterating through the array to rearrange elements around the pivot
        for (int j = start; j <= end - 1; j++) {
            if (array[j] < pivot) {
                // Swap elements if they are less than the pivot
                i++;
                // Swap the elements at indices i and j in the array
                int temp = array[i]; // Store the value of array[i] in a temporary variable
                array[i] = array[j]; // Assign the value of array[j] to array[i]
                array[j] = temp; // Assign the value stored in the temporary variable to array[j]

            }
        }

        // Place the pivot element in its correct position
        i++;
        // Swap the elements at indices i and end in the array
        int temp = array[i]; // Store the value of array[i] in a temporary variable
        array[i] = array[end]; // Assign the value of array[end] to array[i]
        array[end] = temp; // Assign the value stored in the temporary variable to array[end]

        // Return the pivot index
        return i;
    }
}
