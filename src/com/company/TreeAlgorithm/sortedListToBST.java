package com.company.TreeAlgorithm;

public class sortedListToBST {
    public TreeNode sortedListToBST(ListNode head) {
        if (head == null) return null;

        ListNode mid = findmid(head);
        TreeNode node = new TreeNode(mid.val);
        if (head == mid) return node;

        node.left = sortedListToBST(head);
        node.right = sortedListToBST(mid.next);
        return node;
    }


    public ListNode findmid(ListNode head) {
        ListNode previous = null;
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            previous = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        if (previous != null) {
            previous.next = null;
        }

        return slow;
    }
}
