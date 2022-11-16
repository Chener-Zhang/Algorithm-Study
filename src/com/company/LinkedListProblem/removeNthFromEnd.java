package com.company.LinkedListProblem;

import com.company.TreeAlgorithm.ListNode;

public class removeNthFromEnd {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode toRemove = null;
        ListNode current = head;
        ListNode pre = null;
        int len = 0;
        while (current != null) {
            len++;
            if (toRemove != null) {
                pre = toRemove;
                toRemove = toRemove.next;
            }
            if (len == n) {
                toRemove = head;
            }
            current = current.next;
        }
        if (pre == null) return head.next;
        pre.next = toRemove.next;
        return head;
    }
}
