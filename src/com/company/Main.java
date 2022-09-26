package com.company;

import com.company.TreeAlgorithm.*;

import java.util.ArrayList;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        TreeNode root = new TreeNode(20);
        Tree tree = new Tree();
        treeTraversal preOrder = new treeTraversal();
        levelOrderTraversal levelOrderTraversal = new levelOrderTraversal();
        int[] arr = new int[]{10, 15, 25, 21, 27, 8};
        for (int i : arr) {
            tree.insert(root, i);
        }
        levelOrderTraversal.levelOrder(root);
        System.out.println(levelOrderTraversal.res.toString());
        preOrder.inorder(root);


    }


    public static ArrayList<Integer> toArrayList(int[] arr) {
        ArrayList<Integer> res = new ArrayList<Integer>();
        for (int i : arr) {
            res.add(i);
        }
        return res;
    }

    public static ArrayList<Integer> RandomNumberGenerator(int upperbound) {
        Random random = new Random();
        int upperBound = upperbound;
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            arrayList.add(random.nextInt(upperBound));
        }
        System.out.println(arrayList.toString());
        return arrayList;
    }
}
