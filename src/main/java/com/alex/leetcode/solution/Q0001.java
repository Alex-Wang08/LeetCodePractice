package com.alex.leetcode.solution;

import java.util.HashMap;
import java.util.Map;

/**
 * Given an array of integers, return indices of the two numbers
 * such that they add up to a specific target.
 *
 * You may assume that each input would have exactly one solution,
 * and you may not use the same element twice.
 *
 * author: Mr.Wang
 * @date 10/27/2019
 */
public class Q0001 {


    /**
     * @param nums input array
     * @param target the sum
     * @return indices of the two numbers such that they add up to a specific target.
     * author: Mr.Wang
     * @date 10/27/2019
     */
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }

        for (int i = 0; i <nums.length; i++) {
            int n = target - nums[i];
            if (map.containsKey(n) && map.get(n) != i) {
                return new int[] {i, map.get(n)};
            }
        }

        return null;
    }
}
