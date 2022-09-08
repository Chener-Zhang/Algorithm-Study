package com.company.SortingAlgorithem;

import java.util.ArrayList;
import java.util.Arrays;

class bubble_sort {

    ArrayList<Integer> sort(ArrayList<Integer> arr) {
        System.out.println(arr.toString());

        for (int i = 1; i < arr.size(); i++) {

            for (int j = arr.size() - 1; j > 0; j--) {
                if (arr.get(j) < arr.get(j - 1)) {
                    int temp = arr.get(j);
                    arr.set(j, arr.get(j - 1));
                    arr.set(j - 1, temp);
                }

            }
        }
        System.out.println(arr.toString());
        return arr;
    }

}