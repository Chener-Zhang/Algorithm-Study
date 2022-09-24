package com.company.RecursionAlgorithm;

import java.util.ArrayList;
import java.util.List;

public class Combination {

    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> res = new ArrayList();
        List<Integer> temp = new ArrayList();
        helper(1, temp, res, n, k);
        System.out.println(res.toString());
        return res;
    }

    public void helper(int level, List<Integer> temp, List<List<Integer>> res, int n, int k) {

        if (temp.size() == k) {
            res.add(new ArrayList(temp));
        }
        for (int i = level; i <= n; i++) {
            temp.add(i);
            helper(i + 1, temp, res, n, k);
            temp.remove(temp.size() - 1);
        }
    }
}
