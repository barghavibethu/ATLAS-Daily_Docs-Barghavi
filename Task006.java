// TreeNode3.java - Node class
class TreeNode4 {
    int value;
    TreeNode4 left, right;

    TreeNode4(int val) {
        value = val;
        left = right = null;
    }
}

// BinarySearchTree3.java - Tree class with insert, search, and traversal
class BinarySearchTree3 {
    TreeNode4 root;

    BinarySearchTree3() {
        root = null;
    }

    // 1. Insert the root node
    void insertFirst(int value) {
        if (root == null) {
            root = new TreeNode4(value);
        } else {
            System.out.println("Root already exists.");
        }
    }

    // 2. Insert for non-empty tree
    void insertNext(int value) {
        root = insertRec(root, value);
    }

    // Helper recursive insert method
    private TreeNode4 insertRec(TreeNode4 node, int value) {
        if (node == null) return new TreeNode4(value);
        if (value < node.value) node.left = insertRec(node.left, value);
        else if (value > node.value) node.right = insertRec(node.right, value);
        return node;
    }

    // Search for a value
    public boolean search(int value) {
        return searchRecursive(root, value);
    }

    private boolean searchRecursive(TreeNode4 node, int value) {
        if (node == null) return false;
        if (value == node.value) return true;
        else if (value < node.value) return searchRecursive(node.left, value);
        else return searchRecursive(node.right, value);
    }
}
// Task006.java - Main class
public class Task006 {
    public static void main(String[] args) {
        BinarySearchTree3 bst = new BinarySearchTree3();

        bst.insertFirst(10);     // Inserting root
        bst.insertNext(5);       // Inserting other values
        bst.insertNext(15);
        bst.insertNext(2);
        bst.insertNext(7);

        // Search Test
        System.out.println("Search 15: " + bst.search(15));  // true
        System.out.println("Search 9: " + bst.search(9));    // false
    }
}

