package com.company;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Test {
    Test() {

    }

    public void test(ArrayList<Integer> list) {
        Queue<Integer> queue = new PriorityQueue<>();
        for (Integer i : list) {
            queue.add(i);
        }
        System.out.println(queue.poll());
        System.out.println(queue.poll());
    }


}
