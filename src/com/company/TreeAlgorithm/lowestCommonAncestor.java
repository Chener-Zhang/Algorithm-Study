package com.company.TreeAlgorithm;

public class lowestCommonAncestor {
    TreeNode ans;

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        helper(root, p, q);
        return ans;
    }

    public boolean helper(TreeNode root, TreeNode p, TreeNode q) {

        if (root == null) return false;

        int left = helper(root.left, p, q) ? 1 : 0;
        int right = helper(root.right, p, q) ? 1 : 0;
        if (left + right == 2) {
            ans = root;
            return true;
        }
        if (left + right > 0) {
            return true;
        }
        return false;
    }
}
