package com.alex.leetcode.solution.Q0061_Rotate_List;

import com.alex.leetcode.ListNode;

/**
 *Given a linked list, rotate the list to the right by k places, where k is non-negative.
 *
 * Example 1:
 *
 * Input: 1->2->3->4->5->NULL, k = 2
 * Output: 4->5->1->2->3->NULL
 * Explanation:
 * rotate 1 steps to the right: 5->1->2->3->4->NULL
 * rotate 2 steps to the right: 4->5->1->2->3->NULL
 * Example 2:
 *
 * Input: 0->1->2->NULL, k = 4
 * Output: 2->0->1->NULL
 * Explanation:
 * rotate 1 steps to the right: 2->0->1->NULL
 * rotate 2 steps to the right: 1->2->0->NULL
 * rotate 3 steps to the right: 0->1->2->NULL
 * rotate 4 steps to the right: 2->0->1->NULL
 */
public class Q0061 {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null) return head;

        ListNode pEnd = head;
        int len = 1;
        while (pEnd.next != null) {
            pEnd = pEnd.next;
            len++;
        }

        k = k % len;
        ListNode p = head;
        for (int i = 1; i < len - k; i++) {
            p = p.next;
        }

        pEnd.next = head;
        head = p.next;
        p.next = null;

        return head;
    }
}
