package DepthFirstSearch;

import java.util.ArrayList;

/**
 * Class to represent a graph using an Adjacency Matrix
 * and provide methods for Depth Forst Search
 */
public class Graph {

    /**
     * The ArrayList of nodes in the graph
     */
    ArrayList<Node> nodes;

    /**
     * The Adjacency Matrix to represent connections between nodes
     */
    int[][] matrix;

    /**
     * Constructor to initialize size of the graph
     *
     * @param size The number of nodes in the graph
     */
    Graph(int size) {
        nodes = new ArrayList<>();
        matrix = new int[size][size];
    }

    /**
     * Adds a node to the graph
     *
     * @param node The node to be added to the graph
     */
    public void addNode(Node node) {
        nodes.add(node);
    }

    /**
     * Adds an edge between two nodes in the graph
     *
     * @param source The node where the edge starts
     * @param destination The node where the edge ends
     */
    public void addEdge(int source, int destination) {
        matrix[source][destination] = 1;
    }

    /**
     * Checks if there is an edge between two nodes in the graph
     *
     * @param source The node where the edge starts
     * @param destination The node where the edge ends
     * @return true if there is an edge between the two nodes, false otherwise
     */
    public boolean checkEdge(int source, int destination) {
        if (matrix[source][destination] == 1) {
            return true;
        }
        return false;
    }

    /**
     * Performs a Depth-First Search on the graph starting from the source node
     *
     * @param source The node to start the DFS from
     */
    public void depthFirstSearch(int source) {
        // Array to keep track of visited nodes
        boolean[] visited = new boolean[matrix.length];
        // Perform DFS traversal
        dfsHelper(source, visited);
    }

    /**
     * Helper function for Depth-First Search
     *
     * @param source The current node being visited
     * @param visited Array to keep track of visited nodes
     *
     * Recursive function to traverse the graph, starting from the source node.
     * If the current node has not been visited before, mark it as visited and
     * print its data to the console. Then, recursively call the function for
     * all the neighboring nodes of the current node that have not been visited
     * yet.
     */
    private void dfsHelper(int source, boolean[] visited) {
        if (visited[source]) {
            return;
        } else {
            visited[source] = true;
            System.out.println(nodes.get(source).data + " = visited");
        }

        for (int i = 0; i < matrix[source].length; i++) {
            if (matrix[source][i] == 1) {
                dfsHelper(i, visited);
            }
        }
    }

    /**
     * Prints the graph
     */
    public void print() {
        System.out.print("  ");
        for (Node node : nodes) {
            System.out.print(node.data + " ");
        }
        System.out.println();

        for (int i = 0; i < matrix.length; i++) {
            System.out.print(nodes.get(i).data + " ");
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}

