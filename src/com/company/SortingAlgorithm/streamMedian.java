package com.company.SortingAlgorithm;

import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Queue;

public class streamMedian {
    public ArrayList<Integer> online_median(ArrayList<Integer> stream) {
        // Write your code here.
        Queue<Integer> minQueue = new PriorityQueue<>();
        Queue<Integer> maxQueue = new PriorityQueue<>((a, b) -> Integer.compare(b, a));


        ArrayList<Integer> res = new ArrayList<Integer>();

        for (int i : stream) {
            maxQueue.add(i);
            if (maxQueue.size() - minQueue.size() > 1) {
                minQueue.add(maxQueue.poll());
            }
            if (!minQueue.isEmpty() && !maxQueue.isEmpty()) {
                while (maxQueue.peek() > minQueue.peek()) {
                    minQueue.add(maxQueue.poll());
                    maxQueue.add(minQueue.poll());
                }
            }

            if (Integer.compare(maxQueue.size(), minQueue.size()) != 0) {
                res.add(maxQueue.peek());
            } else {

                res.add((maxQueue.peek() + minQueue.peek()) / 2);
            }
        }

        return res;
    }
}
