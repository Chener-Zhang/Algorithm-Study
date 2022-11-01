package com.company.Array;

import java.util.HashMap;
import java.util.Map;

public class subarraySum {
    public int subarraySum(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        int total = 0;
        int count = 0;
        map.put(0, 1);
        for (int num : nums) {
            total += num;
            if (map.containsKey(total - k)) {
                count += map.getOrDefault(total - k, 1);
            }
            map.put(total, map.getOrDefault(total, 0) + 1);
        }
        return count;
    }
}
