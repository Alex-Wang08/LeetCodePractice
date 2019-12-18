package com.alex.leetcode.solution;

/**
 * Given a string s consists of upper/lower-case alphabets and empty space characters ' ', return the length of last word in the string.
 *
 * If the last word does not exist, return 0.
 *
 * Note: A word is defined as a character sequence consists of non-space characters only.
 *
 * Example:
 *
 * Input: "Hello World"
 * Output: 5
 *
 *  * Example:
 *  *
 *  * Input: "Hello World    "
 *  * Output: 5
 *
 * author: Mr.Wang
 * @date 10/30/2019
 */
public class Q0058 {

    public int lengthOfLastWord(String s) {
        if (s == null || s.length() == 0) return 0;

        int count = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) != ' ') count++;
            if (s.charAt(i) == ' ' && count > 0) break;
        }

        return count;
    }
}
