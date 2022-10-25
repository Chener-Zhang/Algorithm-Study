package com.company.DynamicProgramming;

public class canJump {
    public boolean canJump(int[] nums) {
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        for (int i = 0; i < nums.length - 1; i++) {
            if (dp[i] < i + 1) return false;
            dp[i + 1] = Math.max(dp[i], nums[i + 1] + i + 1);
        }
        return true;
    }
}
