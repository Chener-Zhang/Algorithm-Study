package com.company.TreeAlgorithm;

import java.util.*;

public class zigzagTraversal {

    //Iterative Queue method
    public List<List<Integer>> zigzagTraversalQueue(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        LinkedList<TreeNode> queue = new LinkedList<>();
        if (root == null) return res;
        boolean flag = false;
        queue.add(root);
        while (!queue.isEmpty()) {
            List<Integer> temp = new ArrayList<>();
            int size = queue.size();
            //Do not do if queue is not empty becasue queue is always add the new element.
            for (int i = 0; i < size; i++) {
                TreeNode current = queue.remove();
                temp.add(current.val);
                if (current.right != null) queue.add(current.right);
                if (current.left != null) queue.add(current.left);
            }
            if (flag) {
                Collections.reverse(temp);
                flag = false;
            } else {
                flag = true;
            }
            res.add(temp);
        }
//        System.out.println(res.toString());
        return res;
    }

    //Two stacks method
    public List<List<Integer>> zigzagLevelOrderStack(TreeNode root) {
        Stack<TreeNode> stack1 = new Stack<>();
        Stack<TreeNode> stack2 = new Stack<>();

        List<List<Integer>> res = new ArrayList<>();
        if (root == null) return null;
        stack1.push(root);
        while (!stack1.isEmpty() || !stack2.isEmpty()) {
            List<Integer> temp = new ArrayList<>();
            while (!stack1.isEmpty()) {
                TreeNode current = stack1.pop();
                temp.add(current.val);
                if (current.left != null) stack2.push(current.left);
                if (current.right != null) stack2.push(current.right);
            }
            if (!temp.isEmpty()) {
                res.add(new ArrayList<>(temp));
            }
            temp.clear();
            while (!stack2.isEmpty()) {
                TreeNode current = stack2.pop();
                temp.add(current.val);
                if (current.right != null) stack1.push(current.right);
                if (current.left != null) stack1.push(current.left);
            }
            if (!temp.isEmpty()) {
                res.add(new ArrayList<>(temp));
            }
        }
        return res;
    }
}
