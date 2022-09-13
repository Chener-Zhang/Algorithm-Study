package com.company.SortingAlgorithem;

import java.util.Arrays;

public class findKthLargest {
    public int findKthLargest(int[] nums, int k) {
        return sort(nums, 0, nums.length - 1, k);
    }

    public int sort(int[] nums, int low, int high, int k) {
        if (low == high) return nums[low];
        int pivot = partition(nums, low, high);
//        System.out.println(pivot);
//        System.out.println(Arrays.toString(nums));
        if (nums.length - k < pivot) {
            return sort(nums, 0, pivot - 1, k);
        } else if (nums.length - k > pivot) {
            return sort(nums, pivot + 1, high, k);
        } else {
            return nums[pivot];
        }

    }

    public int partition(int[] arr, int low, int high) {

        int pivot = arr[high];
        int i = low - 1;
        for (int j = low; j <= high - 1; j++) {
            if (arr[j] < pivot) {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, high);
        return i + 1;
    }

    public void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
