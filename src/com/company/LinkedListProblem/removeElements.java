package com.company.LinkedListProblem;

import com.company.LeetcodeProblem;
import com.company.TreeAlgorithm.ListNode;

public class removeElements implements LeetcodeProblem {
    public ListNode removeElements(ListNode head, int val) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode current = head;
        ListNode pre = dummy;
        while (current != null) {
            if (current.val == val) pre.next = current.next;
            else {
                pre = current;
            }
            current = current.next;
        }
        return dummy.next;
    }

    @Override
    public void run() {
        ListNode listNode = new ListNode(7);
        ListNode listNode1 = new ListNode(7);
        ListNode listNode2 = new ListNode(7);
        ListNode listNode3 = new ListNode(7);
        listNode.next = listNode1;
        listNode1.next = listNode2;
        listNode2.next = listNode3;

        removeElements(listNode, 7);

    }
}
