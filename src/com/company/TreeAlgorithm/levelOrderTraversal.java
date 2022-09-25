package com.company.TreeAlgorithm;

import java.util.ArrayList;
import java.util.List;

public class levelOrderTraversal {
    public List<List<Integer>> res = new ArrayList<>();

    public List<List<Integer>> levelOrder(TreeNode root) {
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
