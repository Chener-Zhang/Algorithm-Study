package com.company.TreeAlgorithm;

import java.util.LinkedList;
import java.util.Queue;

public class pathSum {

    public boolean hasPathSumIterative(TreeNode root, int targetSum) {
        if (root == null) return false;
        Queue<TreeNode> queue = new LinkedList<>();
        Queue<Integer> queueSum = new LinkedList<>();
        queue.add(root);
        queueSum.add(root.val);
        while (!queue.isEmpty()) {
            TreeNode current = queue.remove();
            int currentSum = queueSum.remove();
            if (currentSum == targetSum && current.left == null && current.right == null) return true;
            if (current.left != null) {
                queue.add(current.left);
                queueSum.add(currentSum + current.left.val);
            }
            if (current.right != null) {
                queue.add(current.right);
                queueSum.add(currentSum + current.right.val);
            }
        }
        return false;
    }

    public boolean hasPathSumRecusion(TreeNode root, int targetSum) {
        if (root == null) return false;
        if (root.left == null && root.right == null && targetSum == root.val) return true;
        return hasPathSumRecusion(root.left, targetSum - root.val) || hasPathSumRecusion(root.right, targetSum - root.val);
    }


}
