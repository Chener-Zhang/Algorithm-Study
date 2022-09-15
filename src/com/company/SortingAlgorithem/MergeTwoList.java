package com.company.SortingAlgorithem;

import java.util.ArrayList;

public class MergeTwoList {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1 = m - 1;
        int p2 = n - 1;
        int p = m + n - 1;

        while (p >= 0) {
            if (p2 < 0) {
                break;
            }
            if (p1 >= 0 && nums1[p1] > nums2[p2]) {
                nums1[p] = nums1[p1];
                p1--;
            } else {
                nums1[p] = nums2[p2];
                p2--;
            }
            p--;
        }
    }

    public ArrayList<Integer> merge_one_into_another(ArrayList<Integer> first, ArrayList<Integer> second) {
        // Write your code here.
        int p1 = first.size() - 1;
        int p2 = (second.size() / 2) - 1;
        int p = second.size() - 1;

        while (p >= 0) {
            if (p1 < 0) break;
            if (p2 >= 0 && second.get(p2) > first.get(p1)) {
                second.set(p, second.get(p2));
                p2--;
            } else {
                second.set(p, first.get(p1));
                p1--;
            }
            p--;
        }

        return second;
    }

}
