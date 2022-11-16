package com.company.String;

import com.company.LeetcodeProblem;

public class minWindow implements LeetcodeProblem {

    int require = 0;
    int have = 0;

    public String minWindow(String s, String t) {
        if (s.length() == 0 || t.length() == 0) {
            return "";
        }
        int[] requirement = new int[128];
        int len = s.length();
        for (char c : t.toCharArray()) {
            requirement[c] += 1;
        }
        int[] map = new int[128];
        this.require = getRequire(requirement);
        int min = len;
        int[] ans = new int[2];
        int l = 0;

        for (int i = 0; i < len; i++) {
            char c = s.charAt(i);
            //update the map
            map[c] += 1;
            //update have;
            if (requirement[c] != 0 && requirement[c] == map[c]) {
                have++;
            }
            //if meet the requirement


            while (have == require) {
                char toRemove = s.charAt(l);
                map[toRemove] -= 1;

                if (requirement[toRemove] != 0 && requirement[toRemove] > map[toRemove]) {
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

    public int getRequire(int[] arr) {
        int sum = 0;
        for (int i : arr) {
            if (i != 0) {
                sum++;
            }
        }
        return sum;
    }

    @Override
    public void run() {
        System.out.println(minWindow("ADOBECODEBANC", "ABBC"));

    }
}
