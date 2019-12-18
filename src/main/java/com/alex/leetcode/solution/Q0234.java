package com.alex.leetcode.solution;

import com.alex.leetcode.ListNode;

import java.util.ArrayList;
import java.util.List;

public class Q0234 {
    public static void main(String[] args) {
        Q0234 q0234 = new Q0234();
        ListNode n1 = new ListNode(-129);
        ListNode n2 = new ListNode(-129);
        n1.next = n2;

        System.out.println(q0234.isPalindrome(n1));
    }


    public boolean isPalindrome(ListNode head) {
        if (head == null) return true;
        List<Integer> list = new ArrayList<>();

        ListNode p = head;
        while (p != null) {
            list.add(p.val);
            p = p.next;
        }

        int start = 0;
        int end = list.size() - 1;
        while (start < end) {
            if (!list.get(start).equals(list.get(end))) return false;
            start++;
            end--;
        }

        return true;

    }
}
