package com.company;

import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Queue;

public class debug {
    debug() {

    }


    public ArrayList<ArrayList<Integer>> find_combinations(Integer n, Integer k) {
        // Write your code here.
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        helper(1, n, k, new ArrayList(), res);
        System.out.println(res.toString());
        return res;
    }

    public void helper(int level, Integer n, Integer k, ArrayList<Integer> temp, ArrayList<ArrayList<Integer>> res) {
        //Base case
        if (temp.size() == k) {
            res.add(new ArrayList(temp));
            return;
        }

        for (int i = level; i <= n; i++) {
            temp.add(i);
            helper(i + 1, n, k, temp, res);
            temp.remove(temp.size() - 1);
        }

    }


}
