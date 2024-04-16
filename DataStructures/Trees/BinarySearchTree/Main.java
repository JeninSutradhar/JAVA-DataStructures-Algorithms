package Trees.BinarySearchTree;

/**
 * This is the driver class for the binary search tree.
 * 
 * The main method creates a new instance of the binary search tree, inserts
 * several nodes into the tree, removes a node from the tree, and then displays
 * the contents of the tree.
 * 
 * @author Unknown
 *
 */
public class Main {
    public static void main(String[] args) {
        binarySearchTree tree = new binarySearchTree(); // Create a new binary search tree

        tree.insert(new Node(5)); // Insert a new node into the tree (recursive)
        tree.insert(new Node(1)); 
        tree.insert(new Node(9)); 
        tree.insert(new Node(2)); 
        tree.insert(new Node(7)); 
        tree.insert(new Node(3)); 
        tree.insert(new Node(6)); 
        tree.insert(new Node(4)); 
        tree.insert(new Node(8)); 

        System.out.println(tree.search(8));

        tree.remove(1); // Remove a node from the tree (recursive)

        tree.display(); // Display the contents of the tree (recursive)
    }
}

