package com.alex.leetcode.solution.Q0006_ZigZag_Conversion;

/**
 * The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this:
 * (you may want to display this pattern in a fixed font for better legibility)
 *
 * P   A   H   N
 * A P L S I I G
 * Y   I   R
 * And then read line by line: "PAHNAPLSIIGYIR"
 *
 * Write the code that will take a string and make this conversion given a number of rows:
 *
 * string convert(string s, int numRows);
 * Example 1:
 *
 * Input: s = "PAYPALISHIRING", numRows = 3
 * Output: "PAHNAPLSIIGYIR"
 * Example 2:
 *
 * Input: s = "PAYPALISHIRING", numRows = 4
 * Output: "PINALSIGYAHRPI"
 * Explanation:
 *
 * P     I    N
 * A   L S  I G
 * Y A   H R
 * P     I
 *
 */
public class Q0002 {
    public String convert(String s, int numRows) {
        if (numRows == 1) return s;
        int len = s.length();
        int cycleLen = 2 * numRows - 2;
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; i + j < len; j = j + cycleLen) {
                res.append(s.charAt(i + j));
                if (i != 0 && i != numRows -1 && j + cycleLen - i < len) {
                    res.append(s.charAt(j + cycleLen - i));
                }
            }
        }

        return res.toString();
    }
}