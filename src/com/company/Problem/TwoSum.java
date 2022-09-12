package com.company.Problem;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public int[] pair_sum_sorted_array(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int currentSum = arr[left] + arr[right];

            if (currentSum == target) {
                return new int[]{left, right};
            } else if (currentSum > target) {
                right--;
            } else {
                left++;
            }
        }
        return new int[]{-1, -1};
    }

    public ArrayList<Integer> two_sum_unsorted(ArrayList<Integer> numbers, Integer target) {
        // Write your code here
        ArrayList<Integer> list = new ArrayList<Integer>();
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < numbers.size(); i++) {
            int complement = target - numbers.get(i);
            if (map.containsKey(complement)) {
                list.add(i);
                list.add(map.get(complement));
                return list;
            }
            map.put(numbers.get(i), i);
        }
        numbers.add(-1);
        numbers.add(-1);
        return list;
    }

}
