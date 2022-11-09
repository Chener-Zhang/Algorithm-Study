package com.company.Array;

import com.company.LeetcodeProblem;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class partitionLabels implements LeetcodeProblem {
    public List<Integer> partitionLabels(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            map.put(c, map.getOrDefault(0, i));
        }
        int j = 0;
        int previous = 0;
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            j = Math.max(j, map.get(s.charAt(i)));
            if (j == i) {
                res.add(j - previous);
                previous = i + 1;
            }
        }
        return res;
    }

    @Override
    public void run() {
        partitionLabels("ababcbacadefegdehijhklij");
    }
}
