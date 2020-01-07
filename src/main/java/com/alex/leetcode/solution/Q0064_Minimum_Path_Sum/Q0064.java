package com.alex.leetcode.solution.Q0064_Minimum_Path_Sum;

/**
 * Given a m x n grid filled with non-negative numbers,
 * find a path from top left to bottom right which minimizes the sum of all numbers along its path.
 *
 * Note: You can only move either down or right at any point in time.
 *
 * Example:
 *
 * Input:
 * [
 *   [1,3,1],
 *   [1,5,1],
 *   [4,2,1]
 * ]
 * Output: 7
 * Explanation: Because the path 1→3→1→1→1 minimizes the sum.
 */
public class Q0064 {
    public int minPathSum(int[][] grid) {
        //iteration
        int m = grid.length;
        int n = grid[0].length;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 && j == 0) continue;
                if (i == 0) {
                    grid[i][j] = grid[i][j] + grid[i][j - 1];
                } else if (j == 0) {
                    grid[i][j] = grid[i][j] + grid[i - 1][j];
                } else {
                    grid[i][j] = grid[i][j] + Math.min(grid[i][j - 1], grid[i - 1][j]);
                }
            }
        }

        return grid[m - 1][n - 1];
    }

    //recursion
    public int minPathSum_Recursion(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int[][] minPath = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                minPath[i][j] = -1;
            }
        }

        return minPathSumFrom(grid, minPath, m, n, 0, 0);
    }

    private int minPathSumFrom(int[][] grid, int[][] minPath, int m, int n, int i, int j) {
        if (minPath[i][j] == -1) {
            if (i == m - 1 && j == n - 1) {
                minPath[i][j] = grid[i][j];
            } else if (i == m - 1) {
                minPath[i][j] = grid[i][j] + minPathSumFrom(grid, minPath, m, n, i, j + 1);
            } else if (j == n - 1) {
                minPath[i][j] = grid[i][j] + minPathSumFrom(grid, minPath, m, n, i + 1, j);
            } else {
                minPath[i][j] = grid[i][j] + Math.min(minPathSumFrom(grid, minPath, m, n, i, j + 1), minPathSumFrom(grid, minPath, m, n, i + 1, j));
            }
        }

        return minPath[i][j];
    }
}
