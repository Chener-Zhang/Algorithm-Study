package com.company.TreeAlgorithm;

public class isSymmetric {
    public boolean isSymmetric(TreeNode root) {
        if (root == null) return true;
        if (root.left.right != root.right.left || root.left.left != root.right.right) {
            return false;
        }
        return isSymmetric(root.left) && isSymmetric(root.right);
    }
}
