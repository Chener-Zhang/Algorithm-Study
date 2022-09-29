package com.company.TreeAlgorithm;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class treeTraversal {

    //Post Order DFS Solution
    public ArrayList<Integer> postorder_traversal(TreeNode root) {
        // Write your code here.
        Stack<TreeNode> stack = new Stack<>();
        ArrayList<Integer> res = new ArrayList<Integer>();

        TreeNode current = root;
        TreeNode pre = null;

        while (current != null || !stack.isEmpty()) {
            while (current != null) {
                stack.push(current);
                current = current.left;
            }

            if (stack.peek().right == null || pre == stack.peek().right) {
                pre = stack.pop();
                res.add(pre.val);
            } else {
                current = stack.peek().right;
            }
        }


        return res;
    }

    //root-left-right
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        LinkedList<TreeNode> stack = new LinkedList<>();
        stack.add(root);
        while (!stack.isEmpty()) {
            TreeNode current = stack.pollLast();
            res.add(current.val);
            if (current.left != null) stack.add(current.left);
            if (current.right != null) stack.add(current.right);
        }
        System.out.println(res.toString());
        return res;
    }

    public ArrayList<Integer> inorder(TreeNode root) {
        // Write your code here.
        ArrayList<Integer> res = new ArrayList<>();
        TreeNode current = root;
        LinkedList<TreeNode> stack = new LinkedList<>();

        while (!stack.isEmpty() || current != null) {
            while (current != null) {
                stack.add(current);
                current = current.left;
            }
            current = stack.pollLast();
            res.add(current.val);
            current = current.right;
        }
        System.out.println(res.toString());
        return res;
    }
}
