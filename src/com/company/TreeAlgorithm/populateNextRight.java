package com.company.TreeAlgorithm;

import com.company.LeetcodeProblem;
import com.company.Tools;

import java.util.LinkedList;
import java.util.Queue;

public class populateNextRight implements LeetcodeProblem {
    public Node connect(Node root) {
        if(root == null) return null;
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            Node node = queue.remove();

            if (node.left != null) {
                node.left.next = node.right;
                queue.add(node.left);
            }
            if (node.right != null) {
                if (node.next != null) {
                    node.right.next = node.next.left;
                } else {
                    node.right.next = null;
                }
                queue.add(node.right);
            }

        }
        return root;
    }

    @Override
    public void run() {
        Node node = new Node(1);
        node.left = new Node(2);
        node.right = new Node(3);
        node.next = null;

        node.left.left = new Node(4);
        node.left.right = new Node(5);
        node.right.left = new Node(6);
        node.right.right = new Node(7);
        connect(node);


    }

    private class Node {
        public int val;
        public Node left;
        public Node right;
        public Node next;

        public Node() {
        }

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, Node _left, Node _right, Node _next) {
            val = _val;
            left = _left;
            right = _right;
            next = _next;
        }
    }

    ;
}


