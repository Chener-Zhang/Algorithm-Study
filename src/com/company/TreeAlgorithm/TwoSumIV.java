package com.company.TreeAlgorithm;

import com.company.LeetcodeProblem;

public class TwoSumIV implements LeetcodeProblem {
    int sum;

    public boolean findTarget(TreeNode root, int k) {
        sum = 0;
        if (helper(root, k) == k) {
            return true;
        }
        return false;
    }

    public int helper(TreeNode root, int k) {
        if (sum == k) return sum;
        if (root.left == null && root.right == null || root.left == null || root.right == null) {
            return root.val;
        }
        sum += helper(root.left, k) + helper(root.right, k) + root.val;
        return sum;
    }

    @Override
    public void run() {
        Tree tree = new Tree();
        TreeNode root = new TreeNode(5);
        int[] arr = {3, 6, 2, 4, 7};
        for (int i : arr) {
            tree.insert(root, i);
        }
        System.out.println(findTarget(root, 9));
    }
}
