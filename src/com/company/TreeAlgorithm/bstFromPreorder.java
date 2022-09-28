package com.company.TreeAlgorithm;

import java.util.Arrays;
import java.util.HashMap;

public class bstFromPreorder {
    public int count = 0;
    public HashMap<Integer, Integer> map = new HashMap<>();
    int[] preorder;

    public TreeNode helper(int left, int right) {
        System.out.printf("left = %d right = %d\n", left, right);
        if (left == right) return null;

        int rootValue = preorder[count];
        TreeNode node = new TreeNode(rootValue);

        int inorderIndex = map.get(rootValue);

        count++;
        node.left = helper(left, inorderIndex);
        node.right = helper(inorderIndex + 1, right);
        return node;
    }

    public TreeNode bstFromPreorder(int[] preorder) {
        this.preorder = preorder;
        int[] inorder = Arrays.copyOf(preorder, preorder.length);
        Arrays.sort(inorder);

        int index = 0;
        for (int i : inorder) {
            map.put(i, index++);
        }
        return helper(0, preorder.length);
    }
}
