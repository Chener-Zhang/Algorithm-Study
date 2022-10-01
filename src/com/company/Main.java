package com.company;

import com.company.TreeAlgorithm.*;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        levelOrderTraversal levelOrderTraversal = new levelOrderTraversal();
        levelOrderTraversal.iterativeSolutionLevelOrder(root);

        treeTraversal treeTraversal = new treeTraversal();
        treeTraversal.postorder_traversal(root);

    }


}
