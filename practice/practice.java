import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class practice {
    static class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
    }

    static int sum = 0;
    static boolean hasPathSum(TreeNode root, int targetSum) {
        if (root != null) sum += root.val;
        if (sum == targetSum) return true;
        if (root.left != null) return hasPathSum(root.left, targetSum);
        if (root.right != null) return hasPathSum(root.right, targetSum);
        return false;
}