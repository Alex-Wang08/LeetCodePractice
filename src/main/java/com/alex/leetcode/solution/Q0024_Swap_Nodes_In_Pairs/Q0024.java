package com.alex.leetcode.solution.Q0024_Swap_Nodes_In_Pairs;

import com.alex.leetcode.ListNode;

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
        // iteration
        ListNode dummyHead = new ListNode(0);
        dummyHead.next = head;
        ListNode prev = dummyHead;
        ListNode curr = head;

        while (curr != null && curr.next != null) {
            ListNode next = curr.next;
            curr.next = next.next;
            prev.next = next;
            next.next = curr;

            prev = curr;
            curr = curr.next;
        }

        return  dummyHead.next;
    }

    //recursion
    public ListNode swapPairs_recursion(ListNode head) {
        if (head == null || head.next == null) return head;

        ListNode next = head.next;
        head.next = swapPairs_recursion(next.next);
        next.next = head;
        return next;
    }
}
