package com.alex.leetcode.medium.Q0092_Reverse_Linked_list_II;

import com.alex.leetcode.ListNode;

/**
 *Reverse a linked list from position m to n. Do it in one-pass.
 *
 * Note: 1 ≤ m ≤ n ≤ length of list.
 *
 * Example:
 *
 * Input: 1->2->3->4->5->NULL, m = 2, n = 4
 * Output: 1->4->3->2->5->NULL
 */
public class Q0092 {
    public ListNode reverseBetween(ListNode head, int m, int n) {
        return reverseBetween_Iteration(head, m, n);
    }

    private ListNode reverseBetween_Iteration(ListNode head, int m, int n) {
        ListNode prev = null;
        ListNode curr = head;
        int index = 1;
        while (index < m) {
            prev = curr;
            curr = curr.next;
            index++;
        }

        ListNode con = prev;
        ListNode tail = curr;
        ListNode next;

        while (index <= n) {
            next = curr.next;
            curr.next = prev;

            prev = curr;
            curr = next;
            index++;
        }

        if (con != null) {
            con.next = prev;
        } else {
            head = prev;
        }
        tail.next = curr;

        return head;
    }
}
