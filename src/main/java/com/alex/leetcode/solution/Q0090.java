package com.alex.leetcode.solution;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


/**
 * Given a collection of integers that might contain duplicates, nums,
 * return all possible subsets (the power set).
 * The solution set must not contain duplicate subsets.
 * author: Mr.Wang
 * @date 10/20/2019
 */
public class Q0090 {

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> lists = new ArrayList<>();
        if (nums == null || nums.length == 0) return lists;

        Arrays.sort(nums); // prepare to exclude duplicate subsets
        generateSubsets(lists, new ArrayList<>(), nums, 0);
        return lists;
    }

    private void generateSubsets(List<List<Integer>> lists,
                                 List<Integer> temp,
                                 int[] nums,
                                 int start) {

        lists.add(new ArrayList<>(temp));

        for (int i = start; i < nums.length; i++) {
            if (i > start && nums[i] == nums[i - 1]) continue;
            temp.add(nums[i]);
            generateSubsets(lists, temp, nums, i + 1);
            temp.remove(temp.size() - 1);
        }
    }
}
