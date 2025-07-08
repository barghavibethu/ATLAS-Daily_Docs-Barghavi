// Node class for the tree
class TreeNode {
    int value;
    TreeNode left, right;

    TreeNode(int val) {
        value = val;
        left = right = null;
    }
}

// Binary Search Tree class
class BinarySearchTree {
    TreeNode root;

    // Constructor initializes an empty tree
    BinarySearchTree() {
        root = null;
    }

    // 1. Insert when the tree is empty
    void insertFirst(int value) {
        if (root == null) {
            root = new TreeNode(value);
            System.out.println("Inserted " + value + " as root node.");
        } else {
            System.out.println("Tree is not empty. Use insertNext() for further inserts.");
        }
    }

    // 2. Insert when the tree has one or more nodes
    void insertNext(int value) {
        root = insertRecursively(root, value);
    }

    // Helper recursive method for insertNext
    private TreeNode insertRecursively(TreeNode node, int value) {
        if (node == null) {
            return new TreeNode(value);
        }
        if (value < node.value) {
            node.left = insertRecursively(node.left, value);
        } else if (value > node.value) {
            node.right = insertRecursively(node.right, value);
        }
        return node;
    }
}
