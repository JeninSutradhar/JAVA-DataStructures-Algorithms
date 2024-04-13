// https://github.com/JeninSutradhar/JAVA-DataStructures-Algorithms
package Graph.AdjecencyList;

// Adjecency List Graph Data Structure
/**
 * Main class for Adjecency List Graph Data Structure
 * 
 * It is an Array List of a Linked List
 * Each Linked List has a unique node at the Head
 * All adjecent Neighbours to that node are added to that node's Linked List
 * 
 * Runtime Complexity to Check Edge O(V)
 */
public class Main {
    public static void main(String[] args) {
        
        // Creating a new instance of Graph
        Graph graph = new Graph();

        // Adding Nodes to the Graph
        graph.addNode(new Node('A'));
        graph.addNode(new Node('B'));
        graph.addNode(new Node('C'));
        graph.addNode(new Node('D'));
        graph.addNode(new Node('E'));

        // Adding Edges to the Graph
        graph.addEdge(1, 2); // A -> B
        graph.addEdge(2, 3); // B -> C
        graph.addEdge(1, 0); // A -> D
        graph.addEdge(3, 4); // C -> E
        graph.addEdge(2, 3); // B -> C

        // Printing the Graph
        graph.print();
    }
}

