package com.alex.leetcode.solution;


/**
 * Given two binary strings, return their sum (also a binary string).
 *
 * The input strings are both non-empty and contains only characters 1 or 0.
 *
 * Example 1:
 *
 * Input: a = "11", b = "1"
 * Output: "100"
 * Example 2:
 *
 * Input: a = "1010", b = "1011"
 * Output: "10101"
 *
 * author: Mr.Wang
 * @date 10/30/2019
 */
public class Q0067 {

    public String addBinary(String a, String b) {
        int m = a.length();
        int n = b.length();
        if (m < n) return addBinary(b, a);

        int carry = 0;
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < m; i++) {
            if (a.charAt(m - i - 1) == '1') carry++;
            if (n - i - 1 >= 0 && b.charAt(n - i - 1) == '1') carry++;

            if (carry % 2 == 0) {
                stringBuilder.append('0');
            } else {
                stringBuilder.append('1');
            }

            carry = carry / 2;
        }

        return stringBuilder.reverse().toString();
    }
}
