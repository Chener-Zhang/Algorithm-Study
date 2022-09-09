package com.company.SortingAlgorithem;

import java.util.ArrayList;

public class HeapSort {
    public HeapSort() {

    }

    public ArrayList<Integer> heap_sort(ArrayList<Integer> arr) {
        //start with the last has child node
        int start = (arr.size() - 1) / 2;
        int len = arr.size();
        for (int i = start; i >= 0; i--) {
            heaplify(arr, len - 1, i);
        }

        System.out.println(arr.toString());
        for (int i = len - 1; i > 0; i--) {
            swap(arr, i, 0);
            heaplify(arr, len, 0);
        }
        System.out.println(arr.toString());
        return null;
    }

    public void heaplify(ArrayList<Integer> arr, int size, int i) {
        int max = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        if (left < size && arr.get(left) > arr.get(max)) {
            max = left;
        }
        if (right < size && arr.get(right) > arr.get(max)) {
            max = right;
        }
        if (i != max) {
            swap(arr, i, max);
            heaplify(arr, size, max);
        }
    }

    public void swap(ArrayList<Integer> arr, int a, int b) {
        int temp = arr.get(a);
        arr.set(a, arr.get(b));
        arr.set(b, temp);
    }

}
