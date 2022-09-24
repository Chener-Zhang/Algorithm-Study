package com.company.SortingAlgorithm;

import java.util.*;

public class threeSum {

    public ArrayList<String> find_zero_sum(ArrayList<Integer> arr) {
        // Write your code here.
        Collections.sort(arr);
        Set<String> res = new HashSet<>();
        for (int i = 0; i < arr.size(); i++) {
            int left = i + 1;
            int right = arr.size() - 1;
            while (left < right) {
                int sum = arr.get(left) + arr.get(right) + arr.get(i);
                if (sum > 0) right--;
                else if (sum < 0) left++;
                else {
                    String s = "" + arr.get(i) + "," + arr.get(left) + "," + arr.get(right);
                    res.add(s);
                    left++;
                    right--;
                    while (arr.get(left) == arr.get(left - 1) && left < right) left++;
                }
            }
        }
        return new ArrayList<>(res);
    }

}
