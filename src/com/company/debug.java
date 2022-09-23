package com.company;

import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Queue;

public class debug {

    public Boolean check_if_sum_possible(ArrayList<Long> arr, Long k) {
        // Write your code here.
        boolean tracker = false;
        tracker = helper(arr, k, Long.valueOf(0), tracker, 0);
        return tracker;
    }

    public boolean helper(ArrayList<Long> arr, Long k, Long sum, boolean tracker, int index) {

        if (arr.size() == 1) {
            return arr.get(0).equals(k);
        }
        if (sum.equals(k)) {
            tracker = true;
            return tracker;
        }
        for (int i = index; i < arr.size(); i++) {
            sum += arr.get(i);
            tracker |= helper(arr, k, sum, tracker, i + 1);
            sum -= arr.get(i);
        }
        return tracker;
    }

}