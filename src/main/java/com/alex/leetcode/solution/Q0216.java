package com.alex.leetcode.solution;


import java.util.ArrayList;
import java.util.List;

/**
 * Find all possible combinations of k numbers that add up to a number n,
 * given that only numbers from 1 to 9 can be used and each combination should be a unique set of numbers.
 * @apiNote
 *      All numbers will be positive integers.
 *      The solution set must not contain duplicate combinations.
 * author: Mr.Wang
 * @date 10/26/2019
 */
public class Q0216 {
    /**
     * @param k how many numbers,
     * @param n the target amount,
     * @return all position combinations
     */
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> lists = new ArrayList<>();
        generateCombinationSum(lists, new ArrayList<>(), 1, n, k);

        return lists;
    }

    private void generateCombinationSum(List<List<Integer>> lists,
                                        List<Integer> temp,
                                        int start,
                                        int leftover,
                                        int k) {

        if (temp.size() == k) {
            if (leftover == 0) lists.add(new ArrayList<>(temp));
            return;
        }

        for (int i = start; i <= 9; i++) {
            if (i > leftover) break; // if i is larger than leftover, there is no possibility that will leftover will be 0
            temp.add(i);
            generateCombinationSum(lists, temp, i + 1, leftover - i, k);
            temp.remove(temp.size() - 1);
        }
    }
}
