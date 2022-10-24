package com.company.LinkedListProblem;

import java.util.HashMap;
import java.util.Map;

public class copyRandomList {
    Map<Node, Node> map = new HashMap<>();

    public Node copyRandomList(Node head) {
        if (head == null) return null;
        Node ptr = head;
        //create the first head;
        Node newNode = new Node(ptr.val);
        map.put(ptr, newNode);

        while (ptr != null) {
            newNode.next = getClone(ptr.next);
            newNode.random = getClone(ptr.random);
            ptr = ptr.next;
            newNode = newNode.next;
        }
        return map.get(head);
    }

    public Node getClone(Node node) {
        if (map.containsKey(node)) {
            return map.get(node);
        } else {
            Node newNode = new Node(node.val);
            map.put(node, newNode);
            return map.get(node);
        }
    }

    private class Node {
        int val;
        Node next;
        Node random;

        public Node(int val) {
            this.val = val;
            this.next = null;
            this.random = null;
        }
    }
}
