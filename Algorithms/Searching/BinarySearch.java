// jeninsutradhar@gmail.com
// https://github.com/JeninSutradhar/JAVA-DataStructures-Algorithms

// Binary-Search Algorithm + Recurcive Binary-search
/*
 * - Binary search is a widely used search algorithm that finds the 
 *   position of a target value within a sorted array. 
 * - It works by repeatedly dividing the search interval in half
*/

 public class BinarySearch {
    /*
     * - The binarySearch method performs an iterative binary search on a sorted array. 
     * - It takes the array and the target element as input and returns the index of 
     *   the target element if found, otherwise returns -1.
     */
    // Iterative Binary Search
    public static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            // Check if target is present at mid
            if (arr[mid] == target)
                return mid;

            // If target is greater, ignore left half
            if (arr[mid] < target)
                left = mid + 1;
            // If target is smaller, ignore right half
            else
                right = mid - 1;
        }
        // If we reach here, then the element was not present
        return -1;
    }


    // Recursive Binary Search
    /*
     * - The 'binarySearchRecursive' method performs a recursive binary search on a sorted array. 
     * - It takes the array, target element, and the left and right indices as input and 
     *   returns the index of the target element if found, otherwise returns -1.
     */
    public static int binarySearchRecursive(int[] arr, int target, int left, int right) {
        if (left <= right) {
            int mid = left + (right - left) / 2;

            // Check if target is present at mid
            if (arr[mid] == target)
                return mid;

            // If target is greater, ignore left half
            if (arr[mid] < target)
                return binarySearchRecursive(arr, target, mid + 1, right);
            // If target is smaller, ignore right half
            else
                return binarySearchRecursive(arr, target, left, mid - 1);
        }
        // If we reach here, then the element was not present
        return -1;
    }

    public static void main(String[] args) {
        /*
         * usage of both versions of the binary search algorithm on a sorted array
         */
        int[] arr = {1, 3, 5, 7, 9, 11, 13, 15};
        int target = 9;


        // Using iterative binary search
        int index = binarySearch(arr, target);
        if (index != -1)
            System.out.println("Iterative Binary Search: Element found at index " + index);
        else
            System.out.println("Iterative Binary Search: Element not found");


        // Using recursive binary search
        index = binarySearchRecursive(arr, target, 0, arr.length - 1);
        if (index != -1)
            System.out.println("Recursive Binary Search: Element found at index " + index);
        else
            System.out.println("Recursive Binary Search: Element not found");
    }
}
