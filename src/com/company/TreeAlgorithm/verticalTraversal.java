package com.company.TreeAlgorithm;

import java.util.*;

public class verticalTraversal {


    public List<List<Integer>> verticalOrderBFS(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        Map<Integer, ArrayList<Integer>> map = new TreeMap<>();
        Map<TreeNode, Integer> levelMap = new HashMap<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        levelMap.put(root, 0);
        while (!queue.isEmpty()) {

            TreeNode current = queue.remove();
            int level = levelMap.get(current);

            if (map.containsKey(level)) {
                map.get(level).add(current.val);
            } else {
                ArrayList<Integer> list = new ArrayList<>();
                list.add(current.val);
                map.put(level, list);
            }
            if (current.left != null) {
                queue.add(current.left);
                levelMap.put(current.left, level - 1);
            }
            if (current.right != null) {
                queue.add(current.right);
                levelMap.put(current.right, level + 1);
            }
        }

        return new ArrayList<>(map.values());
    }

    public List<List<Integer>> verticalTraversal(TreeNode root) {
        TreeMap<Integer, ArrayList<Integer>> map = new TreeMap<>();
        helper(root, 0, map);
        List<List<Integer>> res = new ArrayList<>();
        for (Map.Entry<Integer, ArrayList<Integer>> entry : map.entrySet()) {
            res.add(entry.getValue());
        }
        return res;
    }

    public void helper(TreeNode root, int index, TreeMap<Integer, ArrayList<Integer>> map) {
        if (root == null) return;
        if (!map.containsKey(index)) {
            ArrayList<Integer> list = new ArrayList();
            list.add(root.val);
            map.put(index, list);
        } else {
            map.get(index).add(root.val);
        }
        helper(root.left, index - 1, map);
        helper(root.right, index + 1, map);
    }
}
