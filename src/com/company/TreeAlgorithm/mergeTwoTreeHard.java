package com.company.TreeAlgorithm;

import java.util.*;

public class mergeTwoTreeHard {
    Map<Integer, TreeNode> map;
    Set<Integer> set;

    public TreeNode canMerge(List<TreeNode> trees) {

        //init a map and hashset
        map = new HashMap<>();
        set = new HashSet<>();

        for (TreeNode treeNode : trees) {
            map.put(treeNode.val, treeNode);
            if (treeNode.left != null) set.add(treeNode.left.val);
            if (treeNode.right != null) set.add(treeNode.right.val);
        }
        TreeNode result = null;

        for (TreeNode tree : trees) {
            if (!set.contains(tree.val)) {
                result = tree;
                break;
            }
        }

        return connect(result, Integer.MIN_VALUE, Integer.MAX_VALUE) && map.size() == 1 ? result : null;
    }

    boolean connect(TreeNode root, int min, int max) {
        if (root == null) return true;
        if (root.val >= max || root.val <= min) {
            return false;
        }
        if (root.left == null && root.right == null) {
            TreeNode toBeConnect = map.get(root.val);
            if (toBeConnect != null) {
                root.left = toBeConnect.left;
                root.right = toBeConnect.right;
                map.remove(root.val);
            }

        }
        return connect(root.left, min, root.val) && connect(root.right, root.val, max);

    }

    void printer(TreeNode root) {
        levelOrderTraversal levelOrderTraversal = new levelOrderTraversal();
        System.out.println(levelOrderTraversal.levelOrderRecursion(root).toString());
    }
}
