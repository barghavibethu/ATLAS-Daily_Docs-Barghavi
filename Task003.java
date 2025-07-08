// Node class for the tree
class TreeNode2 {
    int value;
    TreeNode left, right;

    TreeNode2(int val) {
        value = val;
        left = right = null;
    }
}

// Binary Search Tree class
class BinarySearchTree1 {
    TreeNode root;

    // Constructor initializes an empty tree
    BinarySearchTree1() {
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

    // Inorder traversal to display the tree
    void inorderTraversal() {
        System.out.print("Inorder Traversal: ");
        inorderHelper(root);
        System.out.println();
    }

    private void inorderHelper(TreeNode node) {
        if (node != null) {
            inorderHelper(node.left);
            System.out.print(node.value + " ");
            inorderHelper(node.right);
        }
    }
}
