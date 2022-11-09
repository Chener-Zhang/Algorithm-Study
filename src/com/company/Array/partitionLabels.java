package com.company.Array;

import com.company.LeetcodeProblem;

import java.util.ArrayList;
import java.util.List;

public class partitionLabels implements LeetcodeProblem {
    public List<Integer> partitionLabels(String s) {
        int[] map = new int[26];
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            map[c - 'a'] = i;
        }
        int j = 0;
        int previous = 0;
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            j = Math.max(j, map[s.charAt(i) - 'a']);
            if (j == i) {
                res.add(j - previous + 1);
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
