package com.company.Problem;

import java.util.*;

public class fourSumTraditional {
    public List<List<Integer>> fourSumTraditional(int[] nums, int target) {
        Arrays.sort(nums);
        Set<List<Integer>> set = new HashSet<>();
        for (int i = 0; i < nums.length - 3; i++) {
            for (int j = i + 1; j < nums.length - 2; j++) {
                int left = j + 1;
                int right = nums.length - 1;
                while (left < right) {
                    long sum = (long) nums[i] + (long) nums[j] + (long) nums[left] + (long) nums[right];
                    if (sum > target) right--;
                    else if (sum < target) left++;
                    else {
//                        System.out.printf("target = %d sum = %d\n", target, sum);
                        set.add(List.of(nums[i], nums[j], nums[left], nums[right]));
                        left++;
                    }
                }
            }
        }
        System.out.println(set.toString());

        return new ArrayList<>(set);
    }
}
