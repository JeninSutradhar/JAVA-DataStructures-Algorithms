// Big O Notation
/* Describes the performance of an algorithm as the data size (n) increases.
 * It is machine independent.
 * Ignore small operations => O(n+1) -> O(n). 
 */

// Types of Big O Notation
public class Complexity {

    // O(1) Constant time
    /*
     * Takes the same amount of time regardless of the data size.
     * Examples:
     * - Random access of an element.
     * - Inserting at the beginning of a linked list.
     */
    int constantAdd(int n) {
        int sum = n * (n + 1) / 2;
        return sum;
    }

    // O(log n) Logarithmic time
    /*
     * Time taken by the algorithm increases as (n) increases,
     * but not in a linear rate.
     * Example:
     * - Binary search.
     */

    // O(n) Linear time
    /*
     * Time increases linearly.
     * Examples:
     * - Searching through a linked list.
     * - Looping through elements in an array.
     */
    int linearAdd(int n) {
        int sum = 0;
        for (int i = 0; i <= n; i++) { // Linear time (depends on input(n))
            sum += i;
        }
        return sum;
    }

    // O(n log n) Quasilinear Time
    /*
     * Examples:
     * - Quick sorting.
     * - Merge sorting.
     * - Heap sort...
     */

    // O(n^2) Quadratic time
    /*
     * Examples:
     * - Insertion sort.
     * - Selection sort.
     * - Bubble sort.
     */

    // O(n!) Factorial Time (Worst of all)

    public static void main(String[] args) {}
}
