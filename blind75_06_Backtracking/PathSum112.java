public class PathSum112 {
    /**
     * Definition for a binary tree node.
     * public class TreeNode {
     *     int val;
     *     TreeNode left;
     *     TreeNode right;
     *     TreeNode() {}
     *     TreeNode(int val) { this.val = val; }
     *     TreeNode(int val, TreeNode left, TreeNode right) {
     *         this.val = val;
     *         this.left = left;
     *         this.right = right;
     *     }
     * }
     */
//    class Solution {
//        public boolean hasPathSum(TreeNode root, int targetSum) {
//            return helperFunc(root, targetSum, 0);
//        }
//
//        boolean helperFunc(TreeNode root, int targetSum, int count) {
//            if (root == null) return false;
//            count += root.val;
//            if (root.left == null && root.right == null) return targetSum == count;
//
//            return helperFunc(root.left, targetSum, count) || helperFunc(root.right, targetSum, count);
//        }
//    }
}
