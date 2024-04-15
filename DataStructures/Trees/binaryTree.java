package Trees;
/**
 * Trees and Binary Trees in Java for Data Structures
 * =================================================
 * 
 * Trees are a common data structure used in many applications.
 * A tree is a nonlinear data structure that consists of nodes,
 * where each node has at most two children.
 * Each node in the tree has some data associated with it,
 * and each node points to its children.
 * 
 * In a Binary Tree, each Node can have at most 2 children.
 * A Binary Tree can be either full, complete or skewed.
 * If all nodes in a full binary tree are either empty or have two children,
 * then it is full.
 * If all levels of a binary tree except possibly the last are fully filled,
 * and all nodes in the last level are as far left as possible,
 * then it is complete.
 * If some nodes have two children and some nodes have no children,
 * then it is Skewed.
 * 
 */
public class binaryTree {

    // Root node of the binary tree
    private Node root;

    /**
     * Constructor for a binary tree
     */
    public binaryTree() {
        root = null;
    }

    /**
     * Inserts a new node into the binary tree
     * 
     * @param data The data to be inserted into the tree
     */
    public void insert(int data) {
        // Create a new node
        Node newNode = new Node(data);

        // If the tree is empty, make the new node the root.
        if (root == null) {
            root = newNode;
        } else {
            Node current = root;
            Node parent;

            // Else, find the correct place to insert the new node
            while (true) {
                parent = current;
                if (data < current.data) {
                    current = current.left;
                    if (current == null) {
                        parent.left = newNode;
                        return;
                    }
                } else {
                    current = current.right;
                    if (current == null) {
                        parent.right = newNode;
                        return;
                    }
                }
            }
        }
    }

    /**
     * A node in the binary tree
     */
    private class Node {
        int data;
        Node left;
        Node right;

        /**
         * Constructor for a node
         * 
         * @param data The data to be stored in the node
         */
        public Node(int data) {
            this.data = data;
            left = null;
            right = null;
        }
    }

}
