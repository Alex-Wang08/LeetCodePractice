package com.alex.leetcode.solution.com.alex.leetcode;

import java.util.List;

public class BaseTest {


    public int[][] generateArrayFromList(List<List<Integer>> lists) {
        int m = lists.size();
        int n = lists.get(0).size();

        int[][] res = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                res[i][j] = lists.get(i).get(j);
            }
        }

        return res;
    }


}
