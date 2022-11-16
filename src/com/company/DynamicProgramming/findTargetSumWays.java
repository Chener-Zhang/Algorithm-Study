package com.company.DynamicProgramming;

import com.company.LeetcodeProblem;

public class findTargetSumWays implements LeetcodeProblem {
    int count;
    int[] nums;
    int target;

    public int findTargetSumWays(int[] nums, int target) {
        this.count = 0;
        this.nums = nums;
        this.target = target;
        helper(0, 0);
        return count;
    }

    public void helper(int index, int sum) {
        if (index == nums.length) {
            if (sum == target) {
                this.count++;
            }
        } else {
            helper(index + 1, sum + nums[index]);
            helper(index + 1, sum - nums[index]);
        }
    }

    @Override
    public void run() {
//        System.out.println(findTargetSumWays(new int[]{2, 4, 8}, 6));
        System.out.println(findTargetSumWays(new int[]{1, 1, 1}, 3));

    }
}
