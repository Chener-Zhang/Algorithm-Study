package com.company.Array;

public class binarySearch {
    public boolean binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        int mid;
        while (left <= right) {
            mid = left + (right - left) / 2;
            if (target == arr[mid]) {
                return true;
            } else if (target > arr[mid]) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return false;
    }
}
