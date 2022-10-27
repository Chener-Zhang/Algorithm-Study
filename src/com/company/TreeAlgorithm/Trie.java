package com.company.TreeAlgorithm;

import java.util.HashMap;
import java.util.Map;

public class Trie {
    TrieNode root;
    Map<Character, TrieNode> children;

    class TrieNode {
        char val;
        boolean isLast;
        Map<Character, TrieNode> children;

        TrieNode(char c) {
            this.val = c;
            children = new HashMap<>();
        }


    }

    public Trie() {
        root = new TrieNode(' ');
        children = new HashMap<>();
    }

    public void insert(String word) {
        TrieNode current = root;
        for (char c : word.toCharArray()) {
            if (!current.children.containsKey(c)) {
                current.children.put(c, new TrieNode(c));
            }
            current = current.children.get(c);
        }
        current.isLast = true;
    }

    public boolean search(String word) {
        TrieNode current = root;
        for (char c : word.toCharArray()) {
            if (!current.children.containsKey(c)) {
                return false;
            }
            current = current.children.get(c);
        }
        return current.isLast;
    }

    public boolean startsWith(String prefix) {
        TrieNode current = root;
        for (char c : prefix.toCharArray()) {
            if (!current.children.containsKey(c)) {
                return false;
            }
            current = current.children.get(c);
        }
        return true;
    }
}
