class TreeNode7 {
    int item;
    TreeNode7 left, right;

    TreeNode7(int item) {
        item = item;
        left = right = null;
    }
}
class BinarySearchTreeOp02 {
    TreeNode7 root;

    public BinarySearchTreeOp02() {
        this.root = null;
    }
    public TreeNode7 search(int key) {
        TreeNode7 current = root;
        while (current != null) {		//	key 30    current 50 == root
            if (key == current.item) {
                return current;
            } else if (key < current.item) {		//	key 80    current 50 == root
                current = current.left;
            } else {
                current = current.right;
            }
        }
        return null;
    }
}
