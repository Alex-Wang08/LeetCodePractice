package com.alex.leetcode.solution;


/**
 * Given a 32-bit signed integer, reverse digits of an integer.
 * example1:
 * Input: 123
 * Output: 321
 *
 * example2:
 *Input: -123
 * Output: -321
 * Example 3:
 *
 * Input: 120
 * Output: 21
 * Note:
 * Assume we are dealing with an environment which could only store integers within
 * the 32-bit signed integer range: [−231,  231 − 1]. For the purpose of this problem,
 * assume that your function returns 0 when the reversed integer overflows.
 *
 * author: Mr.Wang
 * @date 10/27/2019
 */
public class Q0007 {
    public int reverse(int x) {
        int res = 0;
        while (x != 0) {
            int pop = x % 10;

            // int range [-2^31, 2^31 - 1],
            // which is [-2,147,483,648, 2,147,483,647]
            if (res > Integer.MAX_VALUE / 10 ||
                    res == Integer.MAX_VALUE / 10 && pop > 7 ||
                    res < Integer.MIN_VALUE / 10 ||
                    res == Integer.MIN_VALUE / 10 && pop < -8) {
                return 0;
            }

            res = res * 10 + pop;
            x = x / 10;
        }

        return res;
    }
}