package com.alex.leetcode.solution;

import java.util.ArrayList;
import java.util.List;

public class Q0039 {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {

        List<List<Integer>> lists = new ArrayList<>();
        generateCombinationSum(lists, candidates, new ArrayList<Integer>(), target);
        return lists;
    }

    private void generateCombinationSum(List<List<Integer>> lists,
                                        int[] candidates,
                                        List<Integer> temp,
                                        int leftover) {
        for (int num : candidates) {
            if (leftover < num) continue;

            List<Integer> list = new ArrayList<>(temp);
            list.add(num);
            if (leftover == num) {
                lists.add(list);
            } else {
                generateCombinationSum(lists, candidates, list, num - leftover);
            }
        }
    }
}
