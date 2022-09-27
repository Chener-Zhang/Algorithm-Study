package com.company.TreeAlgorithm;

import java.util.ArrayList;

public class printAllRouteTree {
    public ArrayList<ArrayList<Integer>> all_paths_of_a_binary_tree(TreeNode root) {
        // Write your code here.
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        if (root == null) return res;
        helper(root, new ArrayList<Integer>(), res);
        System.out.println(res.toString());
        return res;
    }

    public void helper(TreeNode root, ArrayList<Integer> temp, ArrayList<ArrayList<Integer>> res) {
        if (root.left == null && root.right == null) {
            temp.add(root.val);
            res.add(new ArrayList(temp));
            temp.remove(temp.size() - 1);
            return;
        }
        temp.add(root.val);
        if (root.left != null) helper(root.left, temp, res);
        if (root.right != null) helper(root.right, temp, res);
        temp.remove(temp.size() - 1);
    }

}
