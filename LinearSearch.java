// jeninsutradhar@gmail.com
// created: 09 April 2024
// Simple Linear Search Algorithm

public class LinearSearch {

    // Method to perform linear search
    public static int linearSearch(int[] array, int target) {
        // Traverse through each element of the array
        for (int i = 0; i < array.length; i++) {
            // If the current element equals the target, return its index
            if (array[i] == target) {
                return i;
            }
        }
        // If the target is not found, return -1
        return -1;
    }

    public static void main(String[] args) {
        int[] numbers = { 10, 20, 30, 40, 50, 60 };
        int target = 30;

        // Perform linear search
        int index = linearSearch(numbers, target);

        // Check if the target is found
        if (index != -1) {
            System.out.println("Element found at index: " + index);
        } else {
            System.out.println("Element not found");
        }
    }
}
