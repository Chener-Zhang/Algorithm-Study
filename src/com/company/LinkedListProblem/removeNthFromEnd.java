package com.company.LinkedListProblem;

import com.company.LeetcodeProblem;
import com.company.Tools;
import com.company.TreeAlgorithm.ListNode;

public class removeNthFromEnd implements LeetcodeProblem {
    Tools tools = new Tools();

    public ListNode removeNthFromEndII(ListNode head, int n) {
        ListNode pre = new ListNode(-1);
        pre.next = head;
        ListNode first = pre.next;
        ListNode second = pre;
        for (int i = 1; i < n + 1; i++) {
            first = first.next;
        }

        while (first != null) {
            first = first.next;
            second = second.next;
        }
        second.next = second.next.next;
        return pre.next;

    }

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

    @Override
    public void run() {
        removeNthFromEndII(tools.listNodeCreator(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}), 3);
    }
}
