package com.company.Array;

import com.company.LeetcodeProblem;

import java.util.*;

public class intersect implements LeetcodeProblem {
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        List<Integer> list = new ArrayList<>();
        for (int i : nums1) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        for (int j : nums2) {
            if (map.containsKey(j) && map.get(j) != 0) {
                list.add(j);
                map.put(j, map.get(j) - 1);
            }
        }
        int[] res = new int[list.size()];
        for (int k = 0; k < list.size(); k++) {
            res[k] = list.get(k);
        }
        return res;
    }

    @Override
    public void run() {

    }
}
