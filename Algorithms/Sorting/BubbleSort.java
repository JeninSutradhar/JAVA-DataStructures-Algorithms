package Sorting;

public class BubbleSort {

    public static void main(String[] args) {
        int[] array = {64, 34, 25, 12, 22, 11, 90};

        System.out.println("Original array:");
        printArray(array);

        // Sorting the array using Bubble Sort
        bubbleSort(array);

        System.out.println("\nSorted array:");
        printArray(array);
    }

    /**
     * Sorts an array using Bubble Sort algorithm.
     *
     * @param array The array to be sorted.
     */
    public static void bubbleSort(int[] array) {
        int n = array.length;

        // Traverse through all array elements
        for (int i = 0; i < n - 1; i++) {
            // Last i elements are already in place, so we don't need to check them again
            for (int j = 0; j < n - i - 1; j++) {
                // Swap if the element found is greater than the next element
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    /**
     * Utility method to print an array.
     *
     * @param array The array to be printed.
     */
    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
