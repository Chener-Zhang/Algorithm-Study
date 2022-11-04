package com.company.Array;

import com.company.LeetcodeProblem;

public class findMedianSortedArrays implements LeetcodeProblem {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        int arr[] = new int[n + m];
        int k = 0;
        int i = 0;
        int j = 0;
        while (i < n && j < m) {
            if (nums1[i] < nums2[j]) {
                arr[k++] = nums1[i++];
            } else {
                arr[k++] = nums2[j++];
            }
        }
        while (i < n) {
            arr[k++] = nums1[i++];
        }
        while (j < m) {
            arr[k++] = nums2[j++];
        }

        if ((n + m) % 2 == 1) {
            return arr[(m + n) / 2];
        } else {
            return (arr[(m + n) / 2] + arr[(m + n) / 2 - 1]) / 2.0;
        }


    }

    @Override
    public void run() {
        System.out.println(findMedianSortedArrays(new int[]{1, 2}, new int[]{3, 4}));
    }
}
