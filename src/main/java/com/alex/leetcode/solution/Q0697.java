package com.alex.leetcode.solution;

import java.util.HashMap;
import java.util.Map;

public class Q0697 {

//    @Override
//    public void test() {
//        int[] nums = new int[] {1, 2, 2, 3, 1};
//        System.out.println(findShortestSubArray(nums));
//    }

    public int findShortestSubArray(int[] nums) {
        Map<Integer, int[]> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            if (map.get(num) == null) {
                map.put(num, new int[] {1, i, i});
            } else {
                int[] index = map.get(num);
                index[0]++;
                index[2] = i;
            }
        }

        int min = Integer.MAX_VALUE;
        int degree = 0;
        for (int i : map.keySet()) {
            int[] index = map.get(i);
            if (index[0] > degree) {
                degree = index[0];
                min = index[2] - index[1] + 1;
            } else if (index[0] == degree) {
                min = Math.min(min, index[2] - index[1] + 1);
            }
        }

        return min;
    }
}
