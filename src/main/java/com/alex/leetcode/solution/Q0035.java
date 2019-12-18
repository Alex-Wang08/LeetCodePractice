package com.alex.leetcode.solution;

/**
 * Given a sorted array and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.
 *
 * You may assume no duplicates in the array.
 *
 * Example 1:
 *
 * Input: [1,3,5,6], 5
 * Output: 2
 * Example 2:
 *
 * Input: [1,3,5,6], 2
 * Output: 1
 * Example 3:
 *
 * Input: [1,3,5,6], 7
 * Output: 4
 * Example 4:
 *
 * Input: [1,3,5,6], 0
 * Output: 0
 *
 *
 * author: Mr.Wang
 * @date 10/28/2019
 */
public class Q0035 {
    public int searchInsert(int[] nums, int target) {
        int len = nums.length;
        if (target <= nums[0]) return 0;
        if (target > nums[len - 1]) return len;

        int start = 0;
        int end = len - 1;
        while (start < end) {
            if (target == nums[start]) return start;
            if (target == nums[end]) return end;
            if (start == end - 1) return end;

            int mid = start + (end - start) / 2;
            if (target == nums[mid]) return mid;
            if (target > nums[mid]) {
                start = mid;
            } else {
                end = mid;
            }
        }

        return -1;
    }
}
