package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class debug {


    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        helper(res, new ArrayList<>(), 0, nums);
        System.out.println(res.toString());
        return res;
    }

    public void helper(List<List<Integer>> res, List<Integer> temp, int index, int[] nums) {
        res.add(new ArrayList<>(temp));
        for (int i = index; i < nums.length; i++) {
            temp.add(nums[i]);
            helper(res, temp, i + 1, nums);
            temp.remove(temp.size() - 1);
        }
    }

}