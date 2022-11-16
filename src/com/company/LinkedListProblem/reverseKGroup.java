package com.company.LinkedListProblem;

import com.company.TreeAlgorithm.ListNode;

public class reverseKGroup {
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode ptr = head;
        ListNode reverseHead = null;
        ListNode newHead = null;
        ListNode previousTail = null;
        while (ptr != null) {
            int count = 0;
            while (count < k && ptr != null) {
                ptr = ptr.next;
                count++;
            }
            if (count == k) {
                reverseHead = reverse(head, k);
                if (newHead == null) newHead = reverseHead;
                if (previousTail != null) previousTail.next = reverseHead;
                previousTail = head;
                head.next = ptr;
                head = ptr;

            }
        }

        return newHead;
    }

    public ListNode reverse(ListNode head, int k) {

        ListNode pre = null;
        ListNode current = head;
        while (k > 0) {
            ListNode temp = current.next;
            current.next = pre;
            pre = current;
            current = temp;
            k--;
        }

        return pre;
    }
}
