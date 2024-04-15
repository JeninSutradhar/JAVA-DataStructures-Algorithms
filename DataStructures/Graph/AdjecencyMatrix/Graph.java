package Graph.AdjecencyMatrix;

import java.util.ArrayList;

/**
 * A Graph class for Adjecency Matrix Graph Data Structure
 * <p>
 * The Graph class stores an ArrayList of Nodes and an adjacency matrix
 * to represent the connections between the nodes.
 * <p>
 * The ArrayList is used to keep track of the order of the nodes,
 * while the adjacency matrix is used to represent the connections
 * between the nodes.
 * 
 * @author Jenin Sutradhar
 */
public class Graph {

    /**
     * ArrayList of nodes
     */
    ArrayList<Node> nodes;

    /**
     * Adjacency matrix
     */
    int[][] matrix;

    /**
     * Constructor for the Graph class
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

