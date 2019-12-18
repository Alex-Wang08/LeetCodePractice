package com.alex.leetcode.solution;

/**
 * Given a sorted array,
 * Remove the duplicates in-place such that the elements appear only once and
 * Return the new length
 *
 * Do not allocate extra space for another array, do this by modifying the input array in-place with O(1) extra memory.
 *
 * Example 1:
 *      Given nums = [1, 1, 2]
 *      return length = 2 with the first two elements of nums being 1 and 2 that nums = [1, 2, whatever]
 *
 * author: Mr.Wang
 * @date 10/28/2019
 */
public class Q0026 {
    public int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        if (nums.length == 1) return 1;

        int res = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[res] = nums[i];
                res++;
            }
        }

        return res;
    }
}
