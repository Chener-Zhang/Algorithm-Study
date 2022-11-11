package com.company.String;

import com.company.LeetcodeProblem;

import java.util.HashMap;
import java.util.Map;

public class minWindow implements LeetcodeProblem {
    Map<Character, Integer> requirement;
    Map<Character, Integer> map;
    int require = 0;
    int have = 0;

    public String minWindow(String s, String t) {
        if (s.length() == 0 || t.length() == 0) {
            return "";
        }
        this.requirement = new HashMap<>();
        int len = s.length();
        for (char c : t.toCharArray()) {
            requirement.put(c, requirement.getOrDefault(c, 0) + 1);
        }
        this.map = new HashMap<>();
        this.require = requirement.size();
        int min = len;
        int[] ans = new int[2];
        int l = 0;

        for (int i = 0; i < len; i++) {
            char c = s.charAt(i);
            //update the map
            map.put(c, map.getOrDefault(c, 0) + 1);
            //update have;
            if (requirement.containsKey(c) && requirement.get(c) == map.get(c)) {
                have++;
            }
            //if meet the requirement


            while (have == require) {
                char toRemove = s.charAt(l);
                map.put(toRemove, map.get(toRemove) - 1);

                if (requirement.containsKey(toRemove) && this.requirement.get(toRemove) > this.map.get(toRemove)) {
                    have--;
                }
                if (i - l < min) {
                    min = i - l;
                    ans[0] = l;
                    ans[1] = i + 1;
                }
                l++;
            }


        }
        return s.substring(ans[0], ans[1]);
    }


    @Override
    public void run() {
        System.out.println(minWindow("geeksforgeeks", "eeekg"));


    }
}
