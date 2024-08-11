public class BST_DFS {
    class TreeNode {
        TreeNode left;
        TreeNode right;
        int val;
        TreeNode(int val) { this.val = val; }
    }

    void BST_DFS_inOrder(TreeNode root) {
        // assume that a given TreeNode is sorted as BST
        if (root == null) return;
        BST_DFS_inOrder(root.left);
        System.out.println(root.val);
        BST_DFS_inOrder(root.right);
    }

    void preOrder(TreeNode root) {
        if (root == null) return;
        System.out.println(root.val);
        preOrder(root.left);
        preOrder(root.right);
    }

    void postOrder(TreeNode root) {
        if (root == null) return;
        postOrder(root.left);
        postOrder(root.right);
        System.out.println(root.val);
    }

    // optional
    void reverseOrder(TreeNode root) {
        if (root == null) return;
        reverseOrder(root.right);
        System.out.println(root.val);
        reverseOrder(root.left);
    }
}
