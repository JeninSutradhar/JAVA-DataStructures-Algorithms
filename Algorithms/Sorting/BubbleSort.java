package Sorting;

// Bubble Sort
/*
 * Bubble Sort is the simplest sorting algorithm that works by repeatedly 
 * swapping the adjacent elements if they are in the wrong order
*/

/**
 * BubbleSort
 * This class implements the bubble sort algorithm to sort an array of integers.
 */
public class BubbleSort {
    public static void main(String[] args) {
        // Initialize the array with unsorted elements
        int[] array = { 9, 5, 7, 3, 7, 2, 5, 7, 1 };

        // Call bubbleSort method to sort the array
        bubbleSort(array);

        // Print the sorted array
        for (int i : array) {
            System.out.print(i + " "); // Changed System.err to System.out, and added space for clarity
        }
    }

    /**
     * Sorts an array using the bubble sort algorithm.
     * 
     * @param array The array to be sorted
     */
    public static void bubbleSort(int array[]) {
        // Loop through each element of the array
        for (int i = 0; i < array.length; i++) {
            // Iterate through the unsorted part of the array
            // (last i elements are already sorted)
            for (int x = 0; x < array.length - i - 1; x++) {
                // Swap adjacent elements if they are in the wrong order
                if (array[x] > array[x + 1]) {
                    int temp = array[x];
                    array[x] = array[x + 1];
                    array[x + 1] = temp;
                }
            }
        }
    }

    /*
     * Bubble sort is easy to understand and implement.
     * It does not require any additional memory space.
     * It is a stable sorting algorithm, meaning that elements with the same key
     * value maintain their relative order in the sorted output.
     */
}
