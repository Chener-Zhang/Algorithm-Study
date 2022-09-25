package com.company.TreeAlgorithm;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class preOrder {
    //root-left-right
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        LinkedList<TreeNode> stack = new LinkedList<>();
        stack.add(root);
        while (!stack.isEmpty()) {
            TreeNode current = stack.pollLast();
            res.add(current.val);
            if(current.left!=null)stack.add(current.left);
            if(current.right!=null)stack.add(current.right);
        }
        System.out.println(res.toString());
        return res;
    }
}
