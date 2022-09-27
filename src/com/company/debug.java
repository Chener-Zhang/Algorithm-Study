package com.company;

import com.company.TreeAlgorithm.TreeNode;

import java.util.*;

public class debug {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> list = new ArrayList<String>();
        Queue<TreeNode> qNode = new LinkedList<TreeNode>();
        Queue<String> qStr = new LinkedList<String>();

        if (root == null) return list;
        qNode.add(root);
        qStr.add("");
        while (!qNode.isEmpty()) {
            TreeNode curNode = qNode.remove();
            String curStr = qStr.remove();

            if (curNode.left == null && curNode.right == null) list.add(curStr + curNode.val);
            if (curNode.left != null) {
                qNode.add(curNode.left);
                qStr.add(curStr + curNode.val + "->");
            }
            if (curNode.right != null) {
                qNode.add(curNode.right);
                qStr.add(curStr + curNode.val + "->");
            }
        }
        return list;
    }

}