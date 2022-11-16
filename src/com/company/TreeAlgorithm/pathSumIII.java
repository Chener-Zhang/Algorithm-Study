package com.company.TreeAlgorithm;

import com.company.LeetcodeProblem;

public class pathSumIII implements LeetcodeProblem {
    int ans;

    public int pathSum(TreeNode root, int targetSum) {
        this.ans = 0;
        helper(root, targetSum);
        System.out.println(ans);
        return ans;
    }

    public void helper(TreeNode root, int target) {
        if (root == null) return;
        if (target - root.val == 0) {
            this.ans++;
            return;
        }
        if (target - root.val < 0) {
            helper(root.left, target);
            helper(root.right, target);
        } else {
            helper(root.left, target - root.val);
            helper(root.right, target - root.val);
        }

    }

    @Override
    public void run() {

    }
}
