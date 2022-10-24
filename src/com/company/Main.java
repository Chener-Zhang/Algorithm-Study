package com.company;


import com.company.TreeAlgorithm.TreeNode;
import com.company.TreeAlgorithm.flattenBinaryTree;
import com.company.TreeAlgorithm.levelOrderTraversal;

public class Main {

    public static void main(String[] args) {

        flattenBinaryTree flattenBinaryTree = new flattenBinaryTree();
        TreeNode treeNode = new TreeNode(1);
        treeNode.left = new TreeNode(2);
        treeNode.right = new TreeNode(5);
        treeNode.left.left = new TreeNode(3);
        treeNode.left.right = new TreeNode(4);
        treeNode.right.right = new TreeNode(6);
        levelOrderTraversal levelOrderTraversal = new levelOrderTraversal();
        levelOrderTraversal.iterativeSolutionLevelOrder(treeNode);
        flattenBinaryTree.flatten(treeNode);

    }
}
