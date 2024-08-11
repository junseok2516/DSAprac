public class BinarySearchTree {
    class BinaryTree {
        int val;
        BinaryTree left;
        BinaryTree right;
        BinaryTree(int val) {
            this.val = val;
        }
    }

    boolean searchTargetNode(BinaryTree root, int target) {
        if (root == null) return false;
        if (root.val < target) return searchTargetNode(root.left, target);
        else if (root.val > target) return searchTargetNode(root.right, target);
        else return true;
    }
}
