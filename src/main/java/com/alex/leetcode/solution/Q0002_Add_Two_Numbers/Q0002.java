package com.alex.leetcode.solution.Q0002_Add_Two_Numbers;

import com.alex.leetcode.ListNode;

public class Q0002 {


    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode p1 = l1;
        ListNode p2 = l2;
        ListNode dummyHead = new ListNode(-1);
        ListNode curr = dummyHead;
        int carry = 0;
        while (p1 != null || p2 != null) {
            int x = p1 == null? 0 : p1.val;
            int y = p2 == null? 0 : p2.val;
            int sum = x + y + carry;
            carry = sum / 10;
            curr.next = new ListNode(sum % 10);
            curr = curr.next;
            if (p1 != null) p1 = p1.next;
            if (p2 != null) p2 = p2.next;
        }

        if (carry == 1) curr.next = new ListNode(1);

        return dummyHead.next;
    }
}
