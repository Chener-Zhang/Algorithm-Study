package com.company.RecursionAlgorithem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class combinationII {
    List<List<Integer>> res;

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        res = new ArrayList<>();
        Arrays.sort(candidates);
        helper(new ArrayList<Integer>(), target, 0, candidates);
        return res;
    }

    public void helper(List<Integer> temp, int target, int index, int[] candidates) {
//        System.out.println("current temp " + temp.toString() + " --- current index " + index);
//        System.out.println(Arrays.toString(candidates));
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
}
