package com.company.RecursionAlgorithem;

import java.util.ArrayList;
import java.util.List;

public class subSet {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        helper(nums, 0, res, new ArrayList<>());
        return res;
    }

    public void helper(int[] arr, int level, List<List<Integer>> res, List<Integer> temp) {
        if (level == arr.length) {
            System.out.println(temp.toString());
            res.add(new ArrayList(temp));
            return;
        }
        //include
        temp.add(arr[level]);
        helper(arr, level + 1, res, temp);
        //exclude
        temp.remove(temp.size() - 1);
        helper(arr, level + 1, res, temp);
    }
}
