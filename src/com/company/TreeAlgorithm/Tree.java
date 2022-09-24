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

    //----------------------------------------------------------------------------------------------------------> delete later
    public void printLevelOrder(node root) {
        int h = height(root);
        int i;
        for (i = 1; i <= h; i++) {
            printCurrentLevel(root, i);
            System.out.print(System.lineSeparator());
        }
    }

    /* Compute the "height" of a tree -- the number of
    nodes along the longest path from the root node
    down to the farthest leaf node.*/
    public int height(node root) {
        if (root == null) return 0;
        else {
            /* compute  height of each subtree */
            int lheight = height(root.left);
            int rheight = height(root.right);

            /* use the larger one */
            if (lheight > rheight) return (lheight + 1);
            else return (rheight + 1);
        }
    }

    /* Print nodes at the current level */
    public void printCurrentLevel(node root, int level) {
        if (root == null) return;
        if (level == 1) System.out.print(root.value + " ");
        else if (level > 1) {
            printCurrentLevel(root.left, level - 1);
            printCurrentLevel(root.right, level - 1);
        }

    }
}
