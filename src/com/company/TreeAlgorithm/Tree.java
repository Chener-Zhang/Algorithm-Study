package com.company.TreeAlgorithm;

public class Tree {
    static node search(node root, int target) {
        if (root == null || root.value == target) return root;
        node current = root;
        while (current != null && current.value != target) {
            if (target > current.value) {
                current = current.right;
            } else {
                current = current.left;
            }
        }
        return current;
    }

    public node insert(node root, int value) {
        if (root == null) {
            node node = new node(value);
            return node;
        }
        if (value > root.value) {
            root.right = insert(root.right, value);
        } else {
            root.left = insert(root.left, value);
        }
        return root;
    }

    public node delete() {
        return null;
    }


}
