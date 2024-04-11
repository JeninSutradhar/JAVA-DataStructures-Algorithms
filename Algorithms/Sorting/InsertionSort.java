// https://github.com/JeninSutradhar/JAVA-DataStructures-Algorithms

// INSERTION SORT ALGORITHM : After compairing Elements to the left, it
//                            Shifts elements to theright to make the 
//                            room/storage to insert a Value.

//                            Usage :
//                            for Small Dataset = Good
//                            for Large Dataset = Bad!
//                            !! Less Steps than Bubble Sort !!


package Sorting;
// This class implements the Insertion Sort algorithm in Java
public class InsertionSort {
    public static void main(String[] args) {
        // Array to be sorted
        int[] array = {4, 6, 8, 5, 0, 3, 1, 2, 7, 9};

        // Sorting the array using Insertion Sort
        insertionSort(array);

        // Printing the sorted array
        for (int i : array) {
            System.out.print(i + " ");
        }
    }

    // Method to perform Insertion Sort
    private static void insertionSort(int[] array) {

        // Loop through each element starting from the second one
        for (int i = 1; i < array.length; i++) { //! Note we used index = 1 to start from the Second Element
        
            // Store the current element to be inserted
            int temp = array[i];
        
            // Start comparing with elements to the left of the current one
            int j = i - 1;
        
            // Shift elements to the right until correct position is found
            while (j >= 0 && array[j] > temp) {
                array[j + 1] = array[j];
                j--;
            }
        
            // Insert the stored element at correct position
            array[j + 1] = temp;
        }
    }    
}
