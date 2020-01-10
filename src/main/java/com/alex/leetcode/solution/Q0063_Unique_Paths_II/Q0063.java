package com.alex.leetcode.solution.Q0063_Unique_Paths_II;

/**
 * A robot is located at the top-left corner of a m x n grid (marked 'Start' in the diagram below).
 *
 * The robot can only move either down or right at any point in time. The robot is trying to reach the bottom-right corner of the grid (marked 'Finish' in the diagram below).
 *
 * Now consider if some obstacles are added to the grids. How many unique paths would there be?
 *
 *
 *
 * An obstacle and empty space is marked as 1 and 0 respectively in the grid.
 *
 * Note: m and n will be at most 100.
 *
 * Example 1:
 *
 * Input:
 * [
 *   [0,0,0],
 *   [0,1,0],
 *   [0,0,0]
 * ]
 * Output: 2
 * Explanation:
 * There is one obstacle in the middle of the 3x3 grid above.
 * There are two ways to reach the bottom-right corner:
 * 1. Right -> Right -> Down -> Down
 * 2. Down -> Down -> Right -> Right
 *
 *
 *
 */

public class Q0063 {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;

        // iteration
        return uniquePathsWithObstacles_Iteration(obstacleGrid, m, n);
    }

    private int uniquePathsWithObstacles_Iteration(int[][] obstacleGrid, int m, int n) {
        int[][] dp = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (obstacleGrid[i][j] == 1) {
                    dp[i][j] = 0;
                } else {
                    if (i == 0 && j== 0) {
                        dp[i][j] = 1;
                    } else if (i == 0) {
                        dp[i][j] = dp[i][j - 1];
                    } else if (j == 0) {
                        dp[i][j] = dp[i - 1][j];
                    } else {
                        dp[i][j] = dp[i][j - 1] + dp[i - 1][j];
                    }
                }
            }
        }

        return dp[m - 1][n - 1];
    }

    private int uniquePathsWithObstacles_Recursion(int[][] obstacleGrid, int m, int n) {
        int[][] dp = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                dp[i][j] = -1;
            }
        }

        return uniquePathsWithObstaclesFrom(obstacleGrid, dp, m, n, 0, 0);
    }

    private int uniquePathsWithObstaclesFrom(int[][] obstacleGrid, int[][] dp, int m, int n, int i, int j) {
        if (dp[i][j] != -1) {
            if (obstacleGrid[i][j] == 1) {
                dp[i][j] = 0;
            } else {
                if (i == m - 1 && j == n - 1) {
                    dp[i][j] = 1;
                } else if (i == m - 1) {
                    dp[i][j] = uniquePathsWithObstaclesFrom(obstacleGrid, dp, m, n, i, j + 1);
                } else if (j == n - 1) {
                    dp[i][j] = uniquePathsWithObstaclesFrom(obstacleGrid, dp, m, n, i + 1, j);
                } else {
                    dp[i][j] = uniquePathsWithObstaclesFrom(obstacleGrid, dp, m, n, i, j + 1) + uniquePathsWithObstaclesFrom(obstacleGrid, dp, m, n, i + 1, j);
                }
            }
        }

        return dp[i][j];
    }

}
