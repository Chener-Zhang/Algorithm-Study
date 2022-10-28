package com.company.Array;

public class moveZeroes {
    public void moveZeroes(int[] nums) {
        int lastZero = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                int temp = nums[i];
                nums[i] = nums[lastZero];
                nums[lastZero] = temp;
                lastZero++;
            }
        }

    }


}
