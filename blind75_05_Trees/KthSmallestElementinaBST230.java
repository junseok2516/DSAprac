import com.sun.source.tree.Tree;

import java.util.LinkedList;
import java.util.List;

public class KthSmallestElementinaBST230 {
    class TreeNode {
        TreeNode left;
        TreeNode right;
        int val;
        TreeNode(int val) {
            this.val = val;
        }
    }

    List<Integer> result = new LinkedList<>();
    public int kthSmallest(TreeNode root, int k) {
        inOrder(root);
        return result.get(k-1);
    }

    void inOrder(TreeNode root) {
        if (root == null) return;
        inOrder(root.left);
        result.add(root.val);
        inOrder(root.right);
    }
}
