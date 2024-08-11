import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class BST_BFS {
    class TreeNode {
        TreeNode left;
        TreeNode right;
        int val;
        TreeNode(int val) { this.val = val; }
    }

    void BFS(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int level = 0;
        while (queue.size() > 0) {
            System.out.println("level: " + level);
            for (int i = 0; i < queue.size(); i++) {
                TreeNode currNode = queue.remove();
                System.out.println(currNode.val);
                if (currNode.left != null) {
                    queue.add(currNode.left);
                } else if (currNode.right != null) {
                    queue.add(currNode.right);
                }
                level++;
            }
        }
    }
}
