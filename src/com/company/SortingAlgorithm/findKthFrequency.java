package com.company.SortingAlgorithm;

import java.util.*;

public class findKthFrequency {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i : nums) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        PriorityQueue<Integer> queue = new PriorityQueue<>(Comparator.comparingInt(map::get));


        for (int i : map.keySet()) {
            queue.add(i);
            if (queue.size() > k) {
                queue.poll();
            }
        }

        int[] arr = new int[k];
        int counter = 0;

        while (!queue.isEmpty()) {
            arr[counter] = queue.poll();
            counter++;
        }
        return arr;

    }
}
