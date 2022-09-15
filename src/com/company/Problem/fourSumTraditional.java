package com.company.Problem;

import java.util.*;

public class fourSumTraditional {
    public List<List<Integer>> fourSumTraditional(int[] nums, int target) {
        Arrays.sort(nums);
        Set<List<Integer>> set = new HashSet<>();
        for (int i = 0; i <= nums.length - 4; i++) {
            for (int j = i + 1; j <= nums.length - 3; j++) {
                int left = j;
                int right = nums.length - 1;
                while (left < right) {
                    int sum = nums[i] + nums[j] + nums[left] + nums[right];
                    if (sum > target) right--;
                    if (sum < target) left++;
                    else {
                        set.add(List.of(nums[i], nums[j], nums[left], nums[right]));
                        left++;
                    }
                }
            }
        }
        return new ArrayList<>(set);
    }
}
