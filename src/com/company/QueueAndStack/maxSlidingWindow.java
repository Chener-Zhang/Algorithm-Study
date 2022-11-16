package com.company.QueueAndStack;

import java.util.ArrayDeque;
import java.util.Deque;

public class maxSlidingWindow {
    public int[] maxSlidingWindow(int[] nums, int k) {
        Deque<Integer> queue = new ArrayDeque<Integer>();
        int[] results = new int[nums.length - k + 1];
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            //check outbound
            if (queue.size() > 0 && i - queue.peekFirst() >= k) {
                queue.removeFirst();
            }
            //check first and last
            while (queue.size() > 0 && nums[queue.peekLast()] < nums[i]) {
                queue.removeLast();
            }
            queue.add(i);
            //add i
            if (i >= k - 1) {
                results[index] = nums[queue.peekFirst()];
                index++;
            }
        }
        return results;
    }
}
