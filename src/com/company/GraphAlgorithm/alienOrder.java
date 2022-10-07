package com.company.GraphAlgorithm;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class alienOrder {
    Map<Character, ArrayList<Character>> edgesList;
    Map<Character, Integer> visited;
    String res;


    public String alienOrder(String[] words) {
        boolean boo = constructEdges(words);
        if (boo) return new StringBuilder(TopoSort()).reverse().toString();

        return "";
    }

    public String TopoSort() {
        visited = new HashMap();
        for (Character key : edgesList.keySet()) {
            visited.put(key, 0);
        }
        res = "";


        for (Character key : edgesList.keySet()) {
            if (!dfs(key)) return "";
        }

        return res;
    }

    public boolean dfs(Character start) {
        if (visited.get(start) == 2) return true;
        if (visited.get(start) == 1) return false;
        ArrayList<Character> current = edgesList.get(start);

        visited.put(start, 1);

        for (Character i : current) {
            if (!dfs(i)) return false;
        }
        visited.put(start, 2);
        res += start;

        return true;
    }

    public boolean constructEdges(String[] words) {
        edgesList = new HashMap<>();
        for (String word : words) {
            char[] arr = word.toCharArray();
            for (char c : arr) {
                if (!edgesList.containsKey(c)) {
                    edgesList.put(c, new ArrayList());
                }
            }
        }

        for (int i = 1; i < words.length; i++) {
            //hello world
            String word1 = words[i - 1];
            String word2 = words[i];
            if (word1.length() > word2.length() && word1.startsWith(word2)) {
                return false;
            }
            int min = Math.min(word1.length(), word2.length());
            for (int k = 0; k < min; k++) {
                if (word1.charAt(k) != word2.charAt(k)) {
                    edgesList.get(word1.charAt(k)).add(word2.charAt(k));
                    break;
                }
            }
        }
        return true;
    }
}
