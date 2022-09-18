package com.company.RecursionAlgorithem;

import java.util.ArrayList;

public class Permutation {

    public ArrayList<ArrayList<Integer>> get_permutations(ArrayList<Integer> arr) {
        // Write your code here.
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        helper(res, arr, 0);
        return res;
    }

    public void helper(ArrayList<ArrayList<Integer>> res, ArrayList<Integer> arr, int index) {

        if (index == arr.size() - 1) {
//            System.out.println(arr.toString());
            res.add(new ArrayList(arr));
        } else {
            for (int i = index; i < arr.size(); i++) {
                swap(arr, index, i);
                helper(res, arr, index + 1);
                swap(arr, index, i);
            }
        }


    }

    public void swap(ArrayList<Integer> list, int a, int b) {
        int temp = list.get(a);
        list.set(a, list.get(b));
        list.set(b, temp);
    }

}
