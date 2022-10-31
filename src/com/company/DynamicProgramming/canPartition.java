package com.company.DynamicProgramming;

public class canPartition {
    int[] nums;
    Boolean[][] dp;

    public boolean canPartition(int[] nums) {
        this.nums = nums;
        int total = 0;
        for (int i : nums) {
            total += i;
        }
        if (total % 2 == 1) return false;
        int target = total / 2;
        this.dp = new Boolean[nums.length + 1][target + 1];
        return helper(0, target);

    }

    public boolean helper(int index, int target) {
        if (target == 0) return true;
        else if (target < 0 || index >= this.nums.length) return false;
        else if (dp[index][target] != null) return dp[index][target];
        boolean result = helper(index + 1, target - nums[index]) || helper(index + 1, target);
        dp[index][target] = result;
        return result;
    }
}
