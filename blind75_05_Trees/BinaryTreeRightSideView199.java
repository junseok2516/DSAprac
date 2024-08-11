import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeRightSideView199 {
    class TreeNode {
        TreeNode left;
        TreeNode right;
        int val;
        TreeNode(int val) { this.val = val; }
    }
    public List<Integer> rightSideView(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        List<Integer> result = new LinkedList<>();
        if (root == null) return result;

        queue.add(root);
        while (!queue.isEmpty()) {
            result.add(queue.peek().val);
            System.out.println("result add: " + queue.peek().val);
            int len = queue.size();
            System.out.println("queue size: " + queue.size());
            for (int i = 0; i < len; i++) {
                TreeNode currNode = queue.poll();
                if (currNode.right != null) {
                    queue.add(currNode.right);
                    System.out.println("queue added right: " + currNode.val);
                }
                if (currNode.left != null) {
                    queue.add(currNode.left);
                    System.out.println("queue added left: " + currNode.val);
                }
            }
        }
        return result;
    }
}
