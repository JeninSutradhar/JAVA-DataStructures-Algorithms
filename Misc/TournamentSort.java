// https://github.com/JeninSutradhar/JAVA-DataStructures-Algorithms

// Tournament Sorting Algoritm
/*
 * In this algorithm, we create a tournament tree 
 * where each node represents a comparison between two elements, 
 * and the winner of each comparison moves up the tree until we find the overall winner.
*/
public class TournamentSort {

    // Function to perform tournament sort
    public static void tournamentSort(int[] arr) {
        int n = arr.length;
        int[] tree = new int[2 * n - 1];

        // Build the tournament tree
        buildTournamentTree(arr, tree, n);

        // Perform sorting by repeatedly extracting the minimum element
        for (int i = 0; i < n; i++) {
            arr[i] = extractMin(tree, n);
        }
    }

    // Function to build the tournament tree
    private static void buildTournamentTree(int[] arr, int[] tree, int n) {
        // Fill the leaves of the tree with array elements
        for (int i = 0; i < n; i++) {
            tree[n - 1 + i] = i;
        }

        // Build the rest of the tree by comparing winners
        for (int i = n - 2; i >= 0; i--) {
            tree[i] = (arr[tree[2 * i + 1]] < arr[tree[2 * i + 2]]) ? tree[2 * i + 1] : tree[2 * i + 2];
        }
    }

    // Function to extract the minimum element from the tournament tree
    private static int extractMin(int[] tree, int n) {
        // The minimum element is at the root of the tree
        int minIndex = tree[0];

        // Replace the root with a sentinel value
        tree[0] = Integer.MAX_VALUE;

        // Adjust the tree to restore the heap property
        for (int i = (n - 2) / 2; i >= 0; i--) {
            tree[i] = (tree[2 * i + 1] != Integer.MAX_VALUE && tree[2 * i + 2] != Integer.MAX_VALUE)
                    ? (tree[2 * i + 1] < tree[2 * i + 2] ? tree[2 * i + 1] : tree[2 * i + 2])
                    : (tree[2 * i + 1] != Integer.MAX_VALUE ? tree[2 * i + 1] : tree[2 * i + 2]);
        }

        // Return the minimum element
        return minIndex;
    }

    // Function to print the array
    private static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    // Main method to test the algorithm
    public static void main(String[] args) {
        int[] arr = { 12, 11, 13, 5, 6, 7 };
        System.out.println("Original array:");
        printArray(arr);

        tournamentSort(arr);

        System.out.println("Array after Tournament Sort:");
        printArray(arr);
    }
}
