package com.company;

import com.company.TreeAlgorithm.*;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(5);
        root.left.left = new TreeNode(6);
        root.left.right = new TreeNode(2);
        root.left.right.left = new TreeNode(7);
        root.left.right.right = new TreeNode(4);
        root.right = new TreeNode(1);
        root.right.left = new TreeNode(0);
        root.right.right = new TreeNode(8);

        levelOrderTraversal levelOrderTraversal = new levelOrderTraversal();
        levelOrderTraversal.iterativeSolutionLevelOrder(root);

    }


}
