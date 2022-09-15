package com.company.Problem;

import java.util.ArrayList;

public class findIntersection {

    public ArrayList<Integer> find_intersection(ArrayList<Integer> arr1, ArrayList<Integer> arr2, ArrayList<Integer> arr3) {
        // Write your code here.
        int p1 = 0, p2 = 0, p3 = 0;
        ArrayList<Integer> res = new ArrayList<Integer>();

        while (p1 < arr1.size() && p2 < arr2.size() && p3 < arr3.size()) {

            if (arr1.get(p1) == arr2.get(p2) && arr2.get(p2) == arr3.get(p3)) {
                res.add(arr1.get(p1));
            }
            int min = Math.min(arr1.get(p1), Math.min(arr2.get(p2), arr3.get(p3)));
            if (arr1.get(p1) == min) p1++;
            if (arr2.get(p2) == min) p2++;
            if (arr3.get(p3) == min) p3++;
        }

        if (res.isEmpty()) res.add(-1);

        return res;
    }

}
