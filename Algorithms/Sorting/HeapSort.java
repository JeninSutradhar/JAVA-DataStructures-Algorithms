// https://github.com/JeninSutradhar/JAVA-DataStructures-Algorithms
// Heap Sort Algorithm
/*
 * Heap sort is a comparison-based sorting technique based 
 * on Binary Heap data structure. It is similar to the 
 * selection sort where we first find the minimum element 
 * and place the minimum element at the beginning. 
 * Repeat the same process for the remaining elements.
*/

public class HeapSort {
    @SuppressWarnings("unused")
    public static void main(String args[]) {
        int arr[] = {4, 6, 8, 5, 0, 3, 1, 2, 7, 9};
        int N = arr.length;

        // Create an object of HeapSort
        HeapSort ob = new HeapSort();

        // Call the sort function
        ob.sort(arr);

        System.out.println("Sorted array is");
        // Print the sorted array
        printArray(arr);
    }

    
    // Function to sort an array using Heap Sort algorithm
    public void sort(int arr[]) {
        int N = arr.length;

        // Build heap (rearrange array)
        for (int i = N / 2 - 1; i >= 0; i--)
            heapify(arr, N, i);

        // One by one extract an element from heap
        for (int i = N - 1; i > 0; i--) {
            // Move current root to end
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            // call max heapify on the reduced heap
            heapify(arr, i, 0);
        }
    }

    // To heapify a subtree rooted with node i which is
    // an index in arr[]. n is size of heap
    void heapify(int arr[], int N, int i) {
        int largest = i; // Initialize largest as root
        int l = 2 * i + 1; // left = 2*i + 1
        int r = 2 * i + 2; // right = 2*i + 2

        // If left child is larger than root
        if (l < N && arr[l] > arr[largest])
            largest = l;

        // If right child is larger than largest so far
        if (r < N && arr[r] > arr[largest])
            largest = r;

        // If largest is not root
        if (largest != i) {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;

            // Recursively heapify the affected sub-tree
            heapify(arr, N, largest);
        }
    }

    /* A utility function to print array of size n */
    static void printArray(int arr[]) {
        int N = arr.length;

        for (int i = 0; i < N; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
}
