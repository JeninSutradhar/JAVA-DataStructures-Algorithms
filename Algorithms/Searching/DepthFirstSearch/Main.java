package DepthFirstSearch;

/**
 * The Depth-First Search Algorithm
 * ==================================
 * 
 * The Depth-First Search algorithm is used to traverse or search tree or graph
 * data structures.
 * It starts at a root node and explores as far as possible along each branch
 * before backtracking.
 * 
 * The algorithm starts at a given source node in the graph and follows these
 * steps:
 * 
 * 1. Mark the source node as visited
 * 2. Recursively visit all the unvisited neighbors of the source node
 * 3. If a neighbor has not been visited, then push it onto a stack for later
 * visiting.
 * 4. If the stack is empty, then the algorithm is complete.
 * 5. If the stack is not empty, then pop a node from the stack, mark it as
 * visited, and recursively visit its neighbors.
 */
public class Main {
    public static void main(String[] args) {
        Graph graph = new Graph(5);

        graph.addNode(new Node('A'));
        graph.addNode(new Node('B'));
        graph.addNode(new Node('C'));
        graph.addNode(new Node('D'));
        graph.addNode(new Node('E'));

        graph.addEdge(0, 1);
        graph.addEdge(1, 2);
        graph.addEdge(1, 4);
        graph.addEdge(2, 3);
        graph.addEdge(3, 4);
        graph.addEdge(4, 2);
        
        graph.depthFirstSearch(4);
        /*
         * * How it fetches the function:
         * ----------------------------
         * The DepthFirstSearch function is called with a source node (i.e. starting
         * point of the search)
         * as an argument.
         * 
         * How it works:
         * ----------------------------
         * The algorithm starts at the source node and recursively visits all the
         * unvisited neighbors of the source node.
         * When it finishes visiting the neighbors, it backtracks and pops a node from
         * the stack if it is not empty.
         * Then, it marks the node as visited and recursively visits its neighbors, and
         * so on.
         * The algorithm continues until the stack is empty, at which point the search
         * is complete.
         */
    }
}
