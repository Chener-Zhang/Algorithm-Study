package com.company.RecursionAlgorithm;

import java.util.*;

public class get_distinct_subsets {


    public ArrayList<String> get_distinct_subsets(String s) {
        // Write your code here.
        ArrayList<String> res = new ArrayList<>();
        char[] arr = s.toCharArray();
        Arrays.sort(arr);
        helper(res, new String(arr), 0, "");
        return res;
    }

    public void helper(ArrayList<String> res, String s, int level, String temp) {
        res.add(temp);
        for (int i = level; i < s.length(); i++) {
            if (i != level && s.charAt(i - 1) == s.charAt(i)) continue;
            temp += s.charAt(i);
            helper(res, s, i + 1, temp);
            temp = temp.substring(0, temp.length() - 1);
        }
    }


    //----------------------------------------------------------------------------------------------------------------->
    public List<List<Integer>> get_distinct_subsets_Number(int[] nums) {
        // Write your code here.
        List<List<Integer>> res = new ArrayList<>();
        int index = 0;
        getSubset(res, new ArrayList<>(), nums, index);
        return res;

    }

    public void getSubset(List<List<Integer>> res, List<Integer> list, int[] nums, int index) {
        res.add(new ArrayList<>(list));
        for (int i = index; i < nums.length; i++) {
            if (i != index && nums[i - 1] == nums[i]) continue;
            list.add(nums[i]);
            getSubset(res, list, nums, i + 1);
            list.remove(list.size() - 1);
        }


    }


}
