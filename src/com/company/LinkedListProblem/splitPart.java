package com.company.LinkedListProblem;

import com.company.TreeAlgorithm.ListNode;

public class splitPart {
    public ListNode[] splitListToParts(ListNode head, int k) {
        int len = 0;
        ListNode current = head;
        while (current != null) {
            len++;
            current = current.next;
        }
        int nGroup = len / k;
        int additionalOne = len % k;

        ListNode[] arr = new ListNode[k];
        ListNode curr = head;
        for (int i = 0; i < k; i++) {
            ListNode temp = curr;
            for (int j = 0; j < nGroup + (additionalOne > 0 ? 1 : 0) - 1; j++) {
                if (curr != null) curr = curr.next;
            }
            additionalOne--;
            if (curr != null) {
                ListNode pre = curr;
                curr = curr.next;
                pre.next = null;
            }

            arr[i] = temp;
        }
        return arr;
    }
}
