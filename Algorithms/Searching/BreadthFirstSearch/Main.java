package BreadthFirstSearch;

/**
 * This class implements the breadth first search algorithm on a graph.
 * The algorithm starts at a given source node (i.e. starting point of the search)
 * and explores all the nodes in the graph level by level, starting from the source node.
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
        graph.addEdge(3, 4);
        graph.addEdge(4, 3);

        graph.breadthFirstSearch(3); // BFS function is called with source node = 0
        // How it works:
        // ----------------------------
        // The algorithm starts at the source node and adds it to a queue.
        // Then, it repeatedly pops a node from the queue, prints it, and adds all of its unvisited neighbors to the queue.
        // The algorithm continues until the queue is empty, at which point the search is complete.
        // 
        // How it fetches the BFS function:
        // ----------------------------
        // The BreadthFirstSearch function is called with a source node (i.e. starting point of the search)
        // as an argument. 
    }
}



