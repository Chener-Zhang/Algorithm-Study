package com.company.Array;

import java.util.Arrays;

public class productExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        int[] res = new int[nums.length];
        int pre = 1;
        for (int i = 1; i <= nums.length; i++) {
            res[i - 1] = pre;
            pre = pre * nums[i - 1];
        }
        int post = 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            res[i] *= post;
            post *= nums[i];
        }
        System.out.println(Arrays.toString(res));
        return res;
    }
}
