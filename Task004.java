class TreeNode3 {
    int value;
    TreeNode left, right;

    TreeNode3(int val) {
        value = val;
        left = right = null;
    }
}

class BinarySearchTree2 {
    TreeNode root;

    BinarySearchTree2() {
        root = null;
    }

    void insertFirst(int value) {
        if (root == null) {
            root = new TreeNode(value);
        } else {
            System.out.println("Root already exists.");
        }
    }

    void insertNext(int value) {
        root = insertRec(root, value);
    }

    private TreeNode insertRec(TreeNode node, int value) {
        if (node == null) return new TreeNode(value);
        if (value < node.value) node.left = insertRec(node.left, value);
        else if (value > node.value) node.right = insertRec(node.right, value);
        return node;
    }

    public void inorderTraversal() {
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

public class Task004 {
    public static void main(String[] args) {
        BinarySearchTree2 bst = new BinarySearchTree2();
        bst.insertFirst(10);
        bst.insertNext(5);
        bst.insertNext(15);
        bst.insertNext(2);
        bst.insertNext(7);

        System.out.println("Inorder traversal:");
        bst.inorderTraversal(); // Output: 2 5 7 10 15
    }
}
