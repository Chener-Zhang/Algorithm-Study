package com.company.TreeAlgorithm;

import com.company.Pair;

import java.util.Deque;
import java.util.LinkedList;

public class maxWidthOfBinaryTree {
    public int maxWidthOfBinaryTree(TreeNode root) {
        Deque<Pair<TreeNode, Integer>> queue = new LinkedList<>();
        queue.add(new Pair<>(root, 1));
        int max = 0;
        while (!queue.isEmpty()) {
            int len = queue.size();
            max = Math.max(queue.peekLast().getValue() - queue.peekFirst().getValue() + 1, max);

            for (int i = 0; i < len; i++) {
                Pair current = queue.remove();
                TreeNode node = (TreeNode) current.getKey();
                int index = (int) current.getValue();
                if (node.left != null) queue.add(new Pair<>(node.left, 2 * index));
                if (node.right != null) queue.add(new Pair<>(node.right, 2 * index + 1));
            }


        }
        System.out.println(max);
        return max;
    }
}
