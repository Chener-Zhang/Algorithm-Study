package com.company.String;

import com.company.LeetcodeProblem;

public class oneEditDistance implements LeetcodeProblem {
    public boolean isOneEditDistance(String s, String t) {
        if (s.length()  > 1 + t.length() || t.length() > 1 +s.length()) return false;
        int count = 0;
        int a = 0, b = 0;
        int slen = s.length();
        int tlen = t.length();
        while (a < slen && b < tlen) {
            if (s.charAt(a) != t.charAt(b)) {
                count++;
                if (slen > tlen) {
                    a++;

                } else if (slen < tlen) {
                    b++;

                } else {
                    a++;
                    b++;

                }
            } else {
                a++;
                b++;
            }
            if (count > 1) return false;
        }
        if (slen == tlen && count == 0) return false;
        return true;
    }

    @Override
    public void run() {

        System.out.println(isOneEditDistance("teacher", "teacherly"));
    }
}
