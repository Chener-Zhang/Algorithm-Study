package com.company.Problem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class fourSum {
    List<List<Integer>> res;

    public fourSum() {

    }

    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        res = new ArrayList<>();

        helper(nums, target, 4, 0, new ArrayList<Integer>());
        return res;
    }

    public void helper(int[] nums, int target, int k, int start, List<Integer> temp) {
        if (k != 2) {

            for (int i = start; i <= nums.length - k; i++) {
                temp.add(nums[i]);
                helper(nums, target - nums[i], k - 1, i + 1, temp);
                temp.remove(temp.size() - 1);
            }
        } else {
            findTwoSum(target, start, nums.length - 1, nums, temp);

        }
    }

    public void findTwoSum(int target, int left, int right, int[] arr, List<Integer> temp) {

        while (left < right) {
            int sum = arr[left] + arr[right];
            if (sum > target) right--;
            else if (sum < target) left++;
            else {
                temp.add(arr[left]);
                temp.add(arr[right]);
                res.add(temp);
                System.out.println(res.toString());
                temp.remove(temp.size() - 1);
                temp.remove(temp.size() - 1);
                left++;
                right--;
            }
        }

    }
}
