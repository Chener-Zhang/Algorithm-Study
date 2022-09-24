package com.company.RecursionAlgorithm;

import java.util.*;

public class combinationII {
    List<List<Integer>> res;

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        res = new ArrayList<>();
        Arrays.sort(candidates);
        helper(new ArrayList<Integer>(), target, 0, candidates);
        return res;
    }

    public void helper(List<Integer> temp, int target, int index, int[] candidates) {

        //base case;
        if (target == 0) {
            res.add(new ArrayList(temp));
            return;
        }

        int previous = -1;
        for (int i = index; i < candidates.length; i++) {
            if (candidates[i] > target) break;
            if (candidates[i] == previous) continue;
            temp.add(candidates[i]);
            helper(temp, target - candidates[i], i + 1, candidates);
            temp.remove(temp.size() - 1);
            previous = candidates[i];
        }
    }


    public List<List<Integer>> generate_all_combinations(ArrayList<Integer> arr, Integer target) {
        // Write your code here.
        res = new ArrayList<>();
        Collections.sort(arr);
        helper(0, target, new ArrayList<>(), arr);
        return res;
    }

    public void helper(int index, int target, ArrayList<Integer> temp, ArrayList<Integer> arr) {
        if (target == 0) {
            res.add(new ArrayList(temp));
            return;
        }
        int previous = -1;
        for (int i = index; i < arr.size(); i++) {

            if (arr.get(i) > target) break;
            if (previous == arr.get(i)) continue;

            temp.add(arr.get(i));
            helper(i + 1, target - arr.get(i), temp, arr);
            temp.remove(temp.size() - 1);

            previous = arr.get(i);
        }
    }
}
