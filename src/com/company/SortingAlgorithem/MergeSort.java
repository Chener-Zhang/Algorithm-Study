package com.company.SortingAlgorithem;

import java.util.Arrays;
import java.util.Random;
import java.util.ArrayList;

public class MergeSort {


    public ArrayList<Integer> merge_sort(ArrayList<Integer> arr, int left, int right) {
        // Write your code here.
        if (arr.isEmpty()) {
            return null;
        }
        if (left < right) {
            int mid = (left + right) / 2;
            merge_sort(arr, left, mid);
            merge_sort(arr, mid + 1, right);
            merge(arr, left, right, mid);
        }
        return arr;
    }

    public void merge(ArrayList<Integer> arr, int left, int right, int mid) {
        int[] a = new int[mid - left + 1];
        int[] b = new int[right - mid];

        for (int i = 0; i < a.length; i++) {
            a[i] = arr.get(left + i);
        }
        for (int i = 0; i < b.length; i++) {
            b[i] = arr.get(mid + i + 1);
        }

        int i = 0;
        int j = 0;
        int k = left;

        while (i < a.length && j < b.length) {
            if (a[i] < b[j]) {
                arr.set(k, a[i]);
                i++;
            } else {
                arr.set(k, b[j]);
                j++;
            }
            k++;
        }

        while (i < a.length) {
            arr.set(k, a[i]);
            i++;
            k++;
        }
        while (j < b.length) {
            arr.set(k, b[j]);
            j++;
            k++;
        }

    }
}

