package com.company;

import com.company.TreeAlgorithm.Tree;
import com.company.TreeAlgorithm.TreeNode;

import java.util.ArrayList;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        TreeNode root = new TreeNode(5);
        Tree tree = new Tree();
        tree.insert(root, 3);
        tree.insert(root, 6);
        tree.insert(root, 2);
        tree.insert(root, 4);
        tree.insert(root, 7);
        System.out.println();

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
