package com.company.TreeAlgorithm;

public class Tree {
    public TreeNode deleteNode(TreeNode root, int key) {
        if (root == null) return null;
        if (key > root.val) {
            root.right = deleteNode(root.right, key);
        } else if (key < root.val) {
            root.left = deleteNode(root.left, key);
        } else {
            if (root.left == null && root.right == null) return null;
            else if (root.left != null && root.right != null) {
                TreeNode replaceNode = preorderSuccessor(root);
                root.val = replaceNode.val;
                root.right = deleteNode(root.right, replaceNode.val);
            } else {
                return root.right == null ? root.left : root.right;
            }
        }
        return root;
    }

    public TreeNode preorderSuccessor(TreeNode root) {
        root = root.right;
        while (root.left != null) {
            root = root.left;
        }
        return root;
    }

    public TreeNode search(TreeNode root, int target) {
        if (root == null || root.val == target) return root;
        TreeNode current = root;
        while (current != null && current.val != target) {
            if (target > current.val) {
                current = current.right;
            } else {
                current = current.left;
            }
        }
        return current;
    }

    public TreeNode insert(TreeNode root, int value) {
        if (root == null) {
            TreeNode node = new TreeNode(value);
            return node;
        }
        if (value > root.val) {
            root.right = insert(root.right, value);
        } else {
            root.left = insert(root.left, value);
        }
        return root;
    }

}
