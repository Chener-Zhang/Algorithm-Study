package com.company.TreeAlgorithm;

public class Tree {
    public node deleteNode(node root, int key) {
        if (root == null) return null;
        if (key > root.value) {
            root.right = deleteNode(root.right, key);
        } else if (key < root.value) {
            root.left = deleteNode(root.left, key);
        } else {
            if (root.left == null && root.right == null) return null;
            else if (root.left != null && root.right != null) {
                node replaceNode = preorderSuccessor(root);
                root.value = replaceNode.value;
                root.right = deleteNode(root.right, replaceNode.value);
            } else {
                return root.right == null ? root.left : root.right;
            }
        }
        return root;
    }

    public node preorderSuccessor(node root) {
        root = root.right;
        while (root.left != null) {
            root = root.left;
        }
        return root;
    }

    public node search(node root, int target) {
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

}
