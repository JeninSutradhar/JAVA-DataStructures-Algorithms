package Trees.BinarySearchTree;

/**
 * A binary search tree (BST) data structure.
 * 
 * A BST is a type of self-balancing binary search tree, which means that the height of the
 * tree is roughly logarithmic with the number of elements. This is achieved by recursively
 * partitioning the tree based on the value of the current node, and ensuring that the tree
 * remains roughly balanced at all times.
 * 
 * There are several key operations that can be performed on a BST:
 * 
 *     Insertion: Insert a new node into the tree, maintaining the BST property
 *     Search: Find a node in the tree with a given key
 *     Removal: Remove a node from the tree, maintaining the BST property
 * 
 * Each of these operations has a time complexity of O(log n), where n is the number of
 * elements in the tree. This means that the time it takes to perform these operations
 * grows logarithmically with the size of the tree.
 * <p>
 * This implementation uses a recursive approach to implement the BST operations. This
 * means that the time complexity of each operation is O(log n), since each recursive call
 * reduces the size of the subtree being searched by half.
 * 
 * The {@link Node} class is used to represent a node in the BST. Each node has a key,
 * a left child node, and a right child node. The key is used to determine the position of
 * the node in the tree, and the left and right child nodes are used to navigate to the left
 * and right subtrees of the node.
 * 
 * The {@link binarySearchTree} class is the main entry point for the BST. It has methods for
 * inserting, searching, and removing nodes from the tree. These methods are implemented
 * using the recursive approach described above.
 */
public class binarySearchTree {
    /**
     * The root node of the BST.
     */
    private Node root;

    /**
     * Inserts a new node into the binary search tree.
     *
     * @param node The new node to be inserted into the tree
     */
    public void insert(Node node) {
        root = insertHelper(root, node);
    }

    /**
     * Helper method for the insert method. Recursively partitions the tree and
     * inserts the new node at the appropriate location.
     *
     * @param root The root of the current subtree
     * @param node The new node to be inserted into the tree
     * @return The root of the subtree containing the inserted node
     */
    private Node insertHelper(Node root, Node node) {
        if (root == null) {
            return node;
        }

        if (node.data < root.data) {
            root.left = insertHelper(root.left, node);
        } else if (node.data > root.data) {
            root.right = insertHelper(root.right, node);
        }

        return root;
    }

    /**
     * Displays the contents of the binary search tree.
     */
    public void display() {
        displayHelper(root);
    }

    /**
     * Helper method for the display method. Recursively traverses the tree and
     * prints the contents of each node.
     *
     * @param root The root of the current subtree
     */
    private void displayHelper(Node root) {
        if (root != null) {
            displayHelper(root.left);
            System.out.println(root.data);
            displayHelper(root.right);
        }
    }

    /**
     * Searches the binary search tree for a node with a given key.
     *
     * @param data The key of the node to search for
     * @return True if a node with the given key is found, false otherwise
     */
    public boolean search(int data) {
        return searchHelper(root, data);
    }

    /**
     * Helper method for the search method. Recursively searches the tree for
     * a node with the given key.
     *
     * @param root The root of the current subtree
     * @param data The key of the node to search for
     * @return True if a node with the given key is found, false otherwise
     */
    private boolean searchHelper(Node root, int data) {
        if (root == null) {
            return false;
        } else if (root.data == data) {
            return true;
        } else if (root.data > data) {
            return searchHelper(root.left, data);
        } else {
            return searchHelper(root.right, data);
        }
    }

    /**
     * Removes a node from the binary search tree with the given key.
     *
     * @param data The key of the node to remove
     */
    public void remove(int data) {
        if (search(data)) {
            root = removeHelper(root, data);
        } else {
            System.out.println(data + " could not be found");
        }
    }

    /**
     * Helper method for the remove method. Recursively searches the tree for
     * a node with the given key and removes it if found.
     *
     * @param root The root of the current subtree
     * @param data The key of the node to remove
     * @return The root of the subtree containing the node after it has been removed
     */
    private Node removeHelper(Node root, int data) {
        if (root == null) {
            return root;
        } else if (data < root.data) {
            root.left = removeHelper(root.left, data);
        } else if (data > root.data) {
            root.right = removeHelper(root.right, data);
        } else {
            // Node found
            if (root.left == null && root.right == null) {
                root = null;
            } else if (root.right != null) {
                root.data = successor(root);
                root.right = removeHelper(root.right, root.data);
            } else {
                root.data = predecessor(root);
                root.left = removeHelper(root.left, root.data);
            }
        }

        return root;
    }

    /**
     * Finds the successor of the given node. The successor is the smallest
     * node in the right subtree of the given node.
     *
     * @param root The node whose successor is to be found
     * @return The key of the successor node
     */
    private int successor(Node root) {
        root = root.right;
        while (root.left != null) {
            root = root.left;
        }
        return root.data;
    }

    /**
     * Finds the predecessor of the given node. The predecessor is the largest
     * node in the left subtree of the given node.
     *
     * @param root The node whose predecessor is to be found
     * @return The key of the predecessor node
     */
    private int predecessor(Node root) {
        root = root.left;
        while (root.right != null) {
            root = root.right;
        }
        return root.data;
    }
}


