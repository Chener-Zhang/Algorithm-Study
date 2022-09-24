package com.company.SortingAlgorithm;


import java.util.ArrayList;

public class QuickSort {
    public void sort(ArrayList<Integer> list, int low, int high) {

        if (low >= high) {
            return;
        }
        //Partition 2
        int pivot = partition2(list, low, high);
        System.out.println(list.toString());
        sort(list, low, pivot - 1);
        sort(list, pivot + 1, high);

        //Partition 1
//        int pivot = partition1(list, low, high);
//        sort(list, low, pivot);
//        sort(list, pivot + 1, high);

    }

    public int partition2(ArrayList<Integer> list, int low, int high) {
        int pivot = list.get(high);
        int i = low - 1;
        for (int j = low; j <= high - 1; j++) {
            if (list.get(j) < pivot) {
                i++;
                swap(list, i, j);
            }
        }

        swap(list, i + 1, high);

        return i + 1;
    }

    public int partition1(ArrayList<Integer> list, int low, int high) {
//        System.out.println("----------------------------------------------\n");
        int pivot = low;
        int start = low - 1;
        int end = high + 1;
//        System.out.println(list.toString() + " low : " + low + " high : " + high);
        while (true) {

            do {
                start++;
            } while (list.get(start) < list.get(pivot));
            do {
                end--;
            } while (list.get(end) > list.get(pivot));

            if (start >= end) {
                System.out.println(end);
                return end;
            }
            swap(list, start, end);
//            System.out.println(list.toString() + " low : " + low + " high : " + high);
        }

    }

    public void swap(ArrayList<Integer> list, int a, int b) {
        int temp = list.get(a);
        list.set(a, list.get(b));
        list.set(b, temp);
    }
}
