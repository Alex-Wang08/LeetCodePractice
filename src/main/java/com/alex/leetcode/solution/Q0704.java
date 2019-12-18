package com.alex.leetcode.solution;

/**
 Given a sorted (in ascending order) integer array nums of n elements and a target value,
 write a function to search target in nums. If target exists, then return its index, otherwise return -1.

 Example 1:

 Input: nums = [-1,0,3,5,9,12], target = 9
 Output: 4
 Explanation: 9 exists in nums and its index is 4

 Example 2:

 Input: nums = [-1,0,3,5,9,12], target = 2
 Output: -1
 Explanation: 2 does not exist in nums so return -1
 * author: Mr.Wang
 * @date 12/14/2019
 */
public class Q0704 {

    public static void main(String[] args) {
        Q0704 q0704 = new Q0704();
        int[] nums = new int[] {-1, 0, 3, 5, 9, 12};
        System.out.println(q0704.search(nums, 9));
    }

    public int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] == target) return mid;
            if (nums[mid] > mid) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return -1;
    }
}
