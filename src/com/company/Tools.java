package com.company;

import com.company.TreeAlgorithm.ListNode;
import com.company.TreeAlgorithm.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Tools {
    public ListNode listNodeCreator(int[] arr) {
        ListNode head = new ListNode(arr[0]);
        ListNode current = head;
        for (int i = 1; i < arr.length; i++) {
            current.next = new ListNode(arr[i]);
            current = current.next;
        }
        //printer
        ListNodePrinter(head);
        return head;
    }

    public void ListNodePrinter(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " - > ");
            current = current.next;
        }
        System.out.print("null");
    }

    //Tools---------------------------------------------------------------------------------------------------------->
    public ArrayList<Integer> toArrayList(int[] arr) {
        ArrayList<Integer> res = new ArrayList<Integer>();
        for (int i : arr) {
            res.add(i);
        }
        return res;
    }

    public ArrayList<ArrayList<Integer>> toTwoDArray(int[][] arr) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        for (int[] current : arr) {
            ArrayList<Integer> temp = new ArrayList<>();
            for (int i : current) {
                temp.add(i);
            }
            res.add(temp);
        }
        return res;
    }

    public List<List<Integer>> toTwoDArrayList(int[][] arr) {
        List<List<Integer>> res = new ArrayList<>();
        for (int[] current : arr) {
            List<Integer> temp = new ArrayList<>();
            for (int i : current) {
                temp.add(i);
            }
            res.add(temp);
        }
        return res;
    }

    public ArrayList<Integer> RandomNumberGenerator(int upperbound) {
        Random random = new Random();
        int upperBound = upperbound;
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            arrayList.add(random.nextInt(upperBound));
        }
        System.out.println(arrayList.toString());
        return arrayList;
    }

    public TreeNode treeConstruction(int[] arr, int i) {
        TreeNode root = null;
        // Base case for recursion
        if (i < arr.length) {
            root = new TreeNode(arr[i]);

            // insert left child
            root.left = treeConstruction(arr, 2 * i + 1);

            // insert right child
            root.right = treeConstruction(arr, 2 * i + 2);
        }
        return root;
    }
}
