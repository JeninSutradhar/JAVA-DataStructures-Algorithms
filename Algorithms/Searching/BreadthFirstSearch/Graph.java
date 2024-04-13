package BreadthFirstSearch;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Graph Data Structure Implementation
 *
 * @author Ajay V
 */
public class Graph {

    /**
     * List of all the nodes in the Graph
     */
    ArrayList<Node> nodes;

    /**
     * Adjacency Matrix representation of the Graph. It stores
     * the weights/connections between the nodes.
     */
    int[][] matrix;

    /**
     * Constructor to create an empty Graph with specified number of nodes.
     *
     * @param size Number of nodes the Graph will have.
     */
    Graph(int size) {
        nodes = new ArrayList<>(size); // Initial capacity of ArrayList is size
        matrix = new int[size][size]; // Size of the 2D array is size x size
    }

    /**
     * Adds a node to the Graph.
     *
     * @param node The node to be added to the Graph.
     */
    public void addNode(Node node) {
        nodes.add(node); // Adds the node to the ArrayList
    }

    /**
     * Adds an edge between 2 nodes in the Graph.
     *
     * @param source The node where the edge starts.
     * @param destination The node where the edge ends.
     */
    public void addEdge(int source, int destination) {
        matrix[source][destination] = 1; // Sets the connection/weight between the 2 nodes
    }

    /**
     * Checks if there is an edge between 2 nodes in the Graph.
     *
     * @param source The node where the edge starts.
     * @param destination The node where the edge ends.
     * @return true if there is an edge between the 2 nodes, false otherwise.
     */
    public boolean checkEdge(int source, int destination) {
        if (matrix[source][destination] == 1) {
            return true; // If the weight between the 2 nodes is 1, there is an edge
        }
        return false;
    }

    /**
     * Prints the Graph in the console.
     */
    public void print() {
        System.out.print("  "); // Leading space
        for (Node node : nodes) { // For each node
            System.out.print(node.data + " "); // Print the data of the node
        }
        System.out.println(); // New line

        for (int i = 0; i < matrix.length; i++) { // For each row
            System.out.print(nodes.get(i).data + " "); // Print the data of the node
            for (int j = 0; j < matrix.length; j++) { // For each column
                System.out.print(matrix[i][j] + " "); // Print the weight between the 2 nodes
            }
            System.out.println(); // New line
        }
    }

    /**
     * Performs Breadth-First Search on the Graph starting from the source node.
     *
     * @param source The node to start the Breadth-First Search from.
     */
    public void breadthFirstSearch(int source) {

        /**
         * Queue to keep track of the nodes to be visited.
         */
        Queue<Integer> queue = new LinkedList<>();

        /**
         * Array to keep track of the visited nodes.
         */
        boolean[] visited = new boolean[matrix.length];

        // Add the source node to the queue and mark it as visited
        queue.offer(source);
        visited[source] = true;

        while (queue.size() != 0) {
            // Get the current node from the queue
            int current = queue.poll();
            System.out.println(nodes.get(current).data + " = visited"); // Print the data of the current node

            for (int i = 0; i < matrix[current].length; i++) { // For each neighbor of the current node
                if (matrix[current][i] == 1 && !visited[i]) { // If there is an edge between the 2 nodes
                    queue.offer(i); // Add the neighbor to the queue
                    visited[i] = true; // Mark the neighbor as visited
                }
            }
        }
    }
}

