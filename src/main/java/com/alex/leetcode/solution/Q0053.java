package com.alex.leetcode.solution;


/**
 * Given an integer array nums, find the contiguous subarray
 * (containing at least one number)
 * which has the largest sum and return its sum.
 * author: Mr.Wang
 * @date 10/20/2019
 */
public class Q0053 {

    public int maxSubArray(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int currMax = nums[0];
        int max = nums[0];
        for (int num : nums) {
            currMax = Math.max(num, currMax + num);
            max = Math.max(max, currMax);
        }

        return max;
    }
}
