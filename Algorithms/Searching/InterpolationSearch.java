// https://github.com/JeninSutradhar/JAVA-DataStructures-Algorithms

// Interpolation Search Algorithm
/*
 * - Interpolation search is an algorithm used for 
 *   searching a target value in a sorted array of integers
 * 
 * - It is an improvement over 'binary search' for cases 
 *   where the data being searched is uniformly distributed (Making a "guess").
 * - We are Guessing where a value Might Be !
*/
// Complexity => Average Case : O(log(log n))
//               Worst Case : O(n) [Values Increases Exponentially]


public class InterpolationSearch {

    public static void main(String[] args) {
        int[] array = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19};
        int target = 15;

        int index = interpolationSearch(array, target);

        if (index != -1) {
            System.out.println("Element found at index: " + index);
        } else {
            System.out.println("Search Failed! [Err : element not found]");
        }
    }

    /**
     * Interpolation search algorithm to find the index of a target value in a sorted array.
     *
     * @param array  The sorted array to search in.
     * @param target The value to search for.
     * @return The index of the target value if found, otherwise -1.
     */
    public static int interpolationSearch(int[] array, int target) {
        int low = 0;
        int high = array.length - 1;

        /*
         * F O R M U L A  
        */
        while (low <= high && target >= array[low] && target <= array[high]) {
            // Calculate the position of probe
            int pos = low + ((target - array[low]) * (high - low)) / (array[high] - array[low]);

            // If target is found at pos
            if (array[pos] == target)
                return pos;

            // If target is greater, ignore left half
            if (array[pos] < target)
                low = pos + 1;
            // If target is smaller, ignore right half
            else
                high = pos - 1;
        }
        
        return -1; 
        // Return -1 if target is not found
    }
}
