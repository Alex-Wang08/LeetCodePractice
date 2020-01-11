package com.alex.leetcode.solution.Q0024_Swap_Nodes_in_Pairs;

import com.alex.leetcode.ListNode;

import java.util.List;

/**
 *Given a linked list, swap every two adjacent nodes and return its head.
 *
 * You may not modify the values in the list's nodes, only nodes itself may be changed.
 *
 * Example:
 *
 * Given 1->2->3->4, you should return the list as 2->1->4->3.
 */
public class Q0024 {

    public ListNode swapPairs(ListNode head) {
        return swapPairs_Recursion(head);
    }

    private ListNode swapPairs_Recursion(ListNode node) {
        if (node == null || node.next == null) return node;

        ListNode next = node.next;
        node.next = swapPairs_Recursion(next.next);
        next.next = node;
        return next;
    }

    private ListNode swapPairs_Iteration(ListNode head) {
        ListNode dummyHead = new ListNode(0);
        dummyHead.next = head;
        ListNode prev = dummyHead;
        ListNode curr = prev.next;

        while (curr != null && curr.next != null) {
            ListNode next = curr.next;
            curr.next = next.next;
            next.next = curr;
            prev.next = next;

            prev = curr;
            curr = prev.next;
        }

        return dummyHead.next;
    }
}
