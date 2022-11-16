package com.company.Array;

import java.util.Arrays;

public class longestConsecutive {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) return 0;
        Arrays.sort(nums);
        int max = 0;
        int currentMax = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                if (nums[i] - 1 == nums[i - 1]) {
                    currentMax++;
                } else {
                    max = Math.max(max, currentMax);
                    currentMax = 0;
                }
            }

        }
        return Math.max(currentMax, max) + 1;
    }
}
