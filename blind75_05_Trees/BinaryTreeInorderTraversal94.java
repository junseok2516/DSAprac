import java.util.LinkedList;
import java.util.List;

public class BinaryTreeInorderTraversal94 {
    static class TreeNode {
        TreeNode right;
        TreeNode left;
        int val;
        TreeNode(int val) {
            this.val = val;
        }
    }
    static List<Integer> result = new LinkedList<>();
    static List<Integer> inorderTraversal(TreeNode root) {
        inOrder(root);
        return result;
    }

    static void inOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        inOrder(root.left);
        result.add(root.val);
        inOrder(root.right);
    }
}
