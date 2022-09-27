package com.company;

import com.company.TreeAlgorithm.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        //Methods
        levelOrderTraversal levelOrderTraversal = new levelOrderTraversal();
        debug debug = new debug();
        sortedListToBST sortedListToBST = new sortedListToBST();

        //Init the value
//        TreeNode root = new TreeNode(1);
//        root.left = new TreeNode(2);
//        root.right = new TreeNode(3);
//        root.left.left = new TreeNode(4);
//        root.left.right = new TreeNode(5);
//        root.right.left = new TreeNode(6);
//        root.right.right = new TreeNode(7);
        ListNode listNode = new ListNode(-10);
        ListNode listNode1 = new ListNode(-3);
        ListNode listNode2 = new ListNode(0);
        ListNode listNode3 = new ListNode(5);
        ListNode listNode4 = new ListNode(9);
        listNode.next = listNode1;
        listNode1.next = listNode2;
        listNode2.next = listNode3;
        listNode3.next = listNode4;


        //Run the test
//        levelOrderTraversal.iterativeSolutionLevelOrder(root);
//        System.out.println(debug.binaryTreePaths(root));
        levelOrderTraversal.iterativeSolutionLevelOrder(sortedListToBST.sortedListToBST(listNode));
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
