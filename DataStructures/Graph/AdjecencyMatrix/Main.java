package Graph.AdjecencyMatrix;

// Adjecency Matrix = A 2D array to store 1's and 0's to represent 
//                    edges of Rows and Columns of a Matrix
/**
 * Main Class to test the Adjecency Matrix Graph
 *
 * It creates a Graph with 5 nodes, and adds edges between them
 * Then prints the Graph to the Console
 */
public class Main {
    public static void main(String[] args) {

        // Create a Graph with 5 nodes
        Graph graph = new Graph(5);

        // Add nodes with char values
        graph.addNode(new Node('A')); // 0  
        graph.addNode(new Node('B')); // 1
        graph.addNode(new Node('C')); // 2
        graph.addNode(new Node('D')); // 3
        graph.addNode(new Node('E')); // 4

        // Add edges between the nodes
        graph.addEdge(0, 1);
        graph.addEdge(1, 2);
        graph.addEdge(3, 4);
        graph.addEdge(4, 3);

        // Print the Graph to the Console
        graph.print();
    }
}
