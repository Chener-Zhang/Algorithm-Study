package com.company.SortingAlgorithem;

import java.util.ArrayList;

public class QuickSort {
    public ArrayList<Integer> sort(ArrayList<Integer> list, int low, int high) {

        if (low < high) {
            int pivot = partition(list, low, high);
            sort(list, low, pivot);
            sort(list, pivot + 1, high);
        }
        return list;
    }

    public int partition(ArrayList<Integer> list, int low, int high) {
        int pivot = low;
        int start = low;
        int end = high;
        while (start < end) {

            do {
                start++;
            } while (list.get(start) < list.get(pivot));
            do {
                end--;
            } while (list.get(end) > list.get(pivot));

            if (start >= end) {
                return end;
            }
            swap(list, start, end);
        }

        swap(list, pivot, end);
        return end;
    }

    public void swap(ArrayList<Integer> list, int a, int b) {
        int temp = list.get(a);
        list.set(a, list.get(b));
        list.set(b, temp);
    }
}
