package com.company.LinkedListProblem;

import java.util.HashMap;
import java.util.Map;

public class LRUCache {
    int capacity;
    doubleLinkedList hot;
    doubleLinkedList cold;
    Map<Integer, doubleLinkedList> map = new HashMap<>();
    int currentCapacity = 0;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        this.hot = new doubleLinkedList();
        this.cold = new doubleLinkedList();
        hot.next = cold;
        cold.pre = hot;
    }

    public int get(int key) {
        //check if it exist
        if (map.containsKey(key)) {
            moveToHead(key);
            return map.get(key).value;
        }
        System.out.println(-1);
        return -1;

    }

    public void moveToHead(int key) {
        remove(map.get(key));
        add(map.get(key));
    }

    public void put(int key, int value) {
        //if map contains key
        if (map.containsKey(key)) {
            map.get(key).value = value;
            moveToHead(key);
        }
        //if map does not contains key
        else {
            //continue add regulary
            map.put(key, new doubleLinkedList(key, value));
            add(map.get(key));
            currentCapacity++;
            if (this.currentCapacity > this.capacity) {
                map.remove(cold.pre.key);
                remove(cold.pre);
            }
        }
    }

    public void printer() {
        doubleLinkedList current = hot;
        while (current != null) {
            System.out.print(current.value + " - > ");
            current = current.next;
        }
        System.out.print("null\n");
    }

    //correct
    public void add(doubleLinkedList node) {
        node.next = hot.next;
        node.pre = hot;
        hot.next.pre = node;
        hot.next = node;
    }

    //correct
    public void remove(doubleLinkedList node) {
        node.pre.next = node.next;
        node.next.pre = node.pre;
    }

    private class doubleLinkedList {
        private doubleLinkedList next;
        private doubleLinkedList pre;
        private int key;
        private int value;

        private doubleLinkedList(int key, int value) {
            this.key = key;
            this.value = value;
        }

        private doubleLinkedList() {

        }

    }
}
