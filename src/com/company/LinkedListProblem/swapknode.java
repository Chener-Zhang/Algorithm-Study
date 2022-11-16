package com.company.LinkedListProblem;

import com.company.TreeAlgorithm.ListNode;

public class swapknode {
    public ListNode swapNodes(ListNode head, int k) {
        ListNode front = null;
        ListNode end = head;
        int len = 0;
        ListNode current = head;
        while (current != null) {
            len++;
            if (len == k) {
                front = current;
            }
            current = current.next;
        }

        for (int i = 0; i < len - k; i++) {
            end = end.next;
        }

        // swap
        int temp = front.val;
        front.val = end.val;
        end.val = temp;
        return head;
    }


}
