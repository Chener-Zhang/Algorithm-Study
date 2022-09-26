package com.company.TreeAlgorithm;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class levelOrderTraversal {
    public List<List<Integer>> res = new ArrayList<>();

    public List<List<Integer>> iterativeSolutionLevelOrder(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            List<Integer> temp = new ArrayList<>();

            int size = queue.size();

            for (int i = 0; i < size; i++) {
                TreeNode current = queue.remove();
                temp.add(current.val);
                if (current.left != null) queue.add(current.left);
                if (current.right != null) queue.add(current.right);
            }
            res.add(temp);
        }
        return res;
    }

    public List<List<Integer>> levelOrderRecursion(TreeNode root) {
        helper(root, 0);
        return res;
    }

    public void helper(TreeNode root, int level) {
        if (root == null) {
            return;
        } else {
            if (res.size() == level) {
                res.add(new ArrayList<>());
            }
            res.get(level).add(root.val);

            if (root.left != null) {
                helper(root.left, level + 1);
            }
            if (root.right != null) {
                helper(root.right, level + 1);
            }

        }
    }
}
