// https://github.com/JeninSutradhar/JAVA-DataStructures-Algorithms

// Pigeon Hole Sort Algorithm
/*
 * The Pigeonhole Sort algorithm is a sorting algorithm 
 * that is based on the principle of the Pigeonhole Principle.

 * this principle suggests that if we have 'n' elements 
 * to be sorted and the range of possible values is relatively small 
 * compared to the number of elements, then there must be 
 * at least one repeated value, allowing us to sort the elements efficiently.
 */

import java.util.*;

public class PigeonholeSort {
    public static void main(String args[]) {
        int arr[] = { 8, 3, 2, 7, 4, 6, 8 };
        PigeonholeSort sortObj = new PigeonholeSort();
        
        // Print Original Array
        System.out.print("Original array: ");
        printArray(arr);
        
        // call sort Function to PigeonSort the Array
        sortObj.sort(arr);

        // Print Sorted Array
        System.out.print("\nSorted array: ");
        printArray(arr);
    }

    public void sort(int arr[]) {

        // Give the Minimum and Maximum Value
        int minVal = arr[0];
        int maxVal = arr[0];
        int range, i, j, index;

        // Find the range of values in the array
        for (int val : arr) {
            if (val < minVal) {
                minVal = val;
            }
            if (val > maxVal) {
                maxVal = val;
            }
        }

        // Determine the size of the range
        range = maxVal - minVal + 1;
        int[] holes = new int[range];
        Arrays.fill(holes, 0);

        // Put each element into its corresponding pigeonhole
        for (i = 0; i < arr.length; i++) {
            holes[arr[i] - minVal] += 1;
        }

        // Traverse through all the pigeonholes
        index = 0;
        for (j = 0; j < range; j++) {
            while (holes[j]-- > 0) {
                arr[index++] = j + minVal;
            }
        }
    }

    // Utility function to print the array
    static void printArray(int arr[]) {
        for (int val : arr) {
            System.out.print(val + " ");
        }
        System.out.println();
    }
}
