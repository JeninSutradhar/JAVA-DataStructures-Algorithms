package Graph.AdjecencyList;

import java.util.*;

/**
 * A Graph class for Adjecency List Graph Data Structure
 * 
 * It is an Array List of a Linked List
 * Each Linked List has a unique node at the Head
 * All adjecent Neighbours to that node are added to that node's Linked List
 * 
 * @author https://github.com/JeninSutradhar
 */
public class Graph {
    
    /**
     * An array list of linked lists to store the adjecency list
     */
    ArrayList<LinkedList<Node>> adjList;

    /**
     * Constructor for the Graph class
     */
    Graph () {
        adjList = new ArrayList<>();
    }

    /**
     * Adds a node to the graph
     * @param node The node to be added to the graph
     */
    public void addNode(Node node) {
        LinkedList<Node> currentList = new LinkedList<>();
        
        currentList.add(node);
        adjList.add(currentList);
    }

    /**
     * Adds an edge between two nodes in the graph
     * @param source The node where the edge starts
     * @param destination The node where the edge ends
     */
    public void addEdge(int source, int destination) {
        LinkedList<Node> currentList = adjList.get(source);
        Node dstNode = adjList.get(destination).get(0);
        currentList.add(dstNode);
    }

    /**
     * Checks if there is an edge between two nodes in the graph
     * @param source The node where the edge starts
     * @param destination The node where the edge ends
     * @return true if there is an edge between the two nodes, false otherwise
     */
    public boolean checkEdge(int source, int destination) {
        LinkedList<Node> currentList = adjList.get(source);
        Node dstNode = adjList.get(destination).get(0);

        for (Node node : currentList) {
            if (node == dstNode) {
                return true;
            }
        }
        return false;
    }

    /**
     * Prints the graph
     */
    public void print() {

        for (LinkedList<Node> currentList : adjList) {
            for (Node node : currentList) {
                System.out.print(node.data + " -> ");
            }
            System.out.println();
        }
        
        // for(int i = 0; i < adjList.size(); i++) {
        //     System.out.print("Node " + i + " -> ");
        //     for(Node neighbor : adjList.get(i)) {
        //         System.out.print(neighbor.data + " ");
        //     }
        //     System.out.println();
        // }
    }
}

