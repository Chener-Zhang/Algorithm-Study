package com.company;

import com.company.TreeAlgorithm.*;

import java.util.ArrayList;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        //Methods
        levelOrderTraversal levelOrderTraversal = new levelOrderTraversal();
        debug debug = new debug();

        //Init the value
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);

        //Run the test
        levelOrderTraversal.iterativeSolutionLevelOrder(root);
        System.out.println(debug.binaryTreePaths(root));
    }


    //Tools---------------------------------------------------------------------------------------------------------->
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
