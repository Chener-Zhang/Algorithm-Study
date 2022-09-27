package com.company.TreeAlgorithm;

public class countUnivalSubtrees {
    public int count;

    public Integer find_single_value_trees(TreeNode root) {
        // Write your code here.
        isUni(root);
        return count;
    }

    public boolean isUni(TreeNode root) {

        if (root == null) return false;
        boolean flag = true;

        if (root.left == null && root.right == null) {
            count++;
            return true;
        }

        if (root.left != null) {
            flag = isUni(root.left) && root.left.val == root.val && flag;
        }
        if (root.right != null) {
            flag = isUni(root.right) && root.right.val == root.val && flag;
        }
        if (flag == false) {
            return false;
        } else {
            count++;
            return true;
        }
    }
}
