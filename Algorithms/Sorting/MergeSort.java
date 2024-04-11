// // https://github.com/JeninSutradhar/JAVA-DataStructures-Algorithms

// THE MERGE SORT ALGORITHM _ JAVA
/* => Recursively divides Array into 2/Half
 * => Sorts the Array
 * => Finally, Re-combines
*/

// Implementation of the Merge Sort algorithm in Java
public class MergeSort {

    public static void main(String[] args) {
        // Array to be sorted
        int[] array = {5, 1, 7, 2, 9, 9, 5, 8, 1024, 3, 4, 6, 8, 0};

        // Sorting the array using Merge Sort
        mergeSort(array);

        for ( int i : array ) {
            // Printing the sorted array
            System.out.print(i + " ");
        }
    }

    // Method to perform Merge Sort
    public static void mergeSort(int[] array) {
        
        // Get the length of the array
        int length = array.length;

        // Base case: If the array has only one element or is empty, return (OPTIONAL : for Error Handling)
        if (length <= 1) {
            return; 
        }

        // Calculate the middle index
        int middle = length / 2;

        // Create left and right arrays
        int[] leftArray = new int[middle];
        int[] rightArray = new int[length - middle];
        
        // Populate left and right arrays
        int i = 0; // Index for left array
        int j = 0; // Index for right array

        /*
         * This loop effectively splits the original array 
         * into two halves and populates the leftArray with the elements 
         * from the first half and the rightArray with the elements from the second half
         */
        for (; i < length; i++) {
            if (i < middle) {
                leftArray[i] = array[i];
            } else {
                rightArray[j] = array[i];
                j++;
            }
        }

        // Recursively call mergeSort on left and right arrays
        mergeSort(leftArray);
        mergeSort(rightArray);

        // Merge the sorted left and right arrays
        merge(array, leftArray, rightArray);
    }


    // Method to merge two sorted arrays
    public static void merge(int[] array, int[] leftArray, int[] rightArray) {
        int leftSize = leftArray.length;
        int rightSize = rightArray.length;

        // Index variables
        int i = 0, l = 0, r = 0;

        // Merging the left and right arrays into the original array
        while (l < leftSize && r < rightSize) {
            if (leftArray[l] < rightArray[r]) {
                array[i] = leftArray[l];
                l++;
            } else {
                array[i] = rightArray[r];
                r++;
            }
            i++;
        }

        // Copy remaining elements from leftArray to the original array
        while (l < leftSize) {
            array[i] = leftArray[l];
            l++;
            i++;
        }
        // Copy remaining elements from rightArray to the original array
        while (r < rightSize) {
            array[i] = rightArray[r];
            r++;
            i++;
        }
    }
}
