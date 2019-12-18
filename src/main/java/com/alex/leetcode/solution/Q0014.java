package com.alex.leetcode.solution;

/**
 * Write a function to find the longest common prefix string amongst an array of strings.
 *
 * If there is no common prefix, return an empty string "".
 *
 * Example 1:
 *
 * Input: ["flower","flow","flight"]
 * Output: "fl"
 * Example 2:
 *
 * Input: ["dog","racecar","car"]
 * Output: ""
 * Explanation: There is no common prefix among the input strings.
 * Note:
 *
 * All given inputs are in lowercase letters a-z.
 *
 * author: Mr.Wang
 * @date 10/27/2019
 */
public class Q0014 {

    public String longestCommonPrefix(String[] strings) {
        StringBuilder stringBuilder = new StringBuilder("");

        for (int i = 0; i < strings[0].length(); i++) {
            char c = strings[0].charAt(i);
            for (int j = 1; j < strings.length; j++) {
                String s = strings[j];
                if (j >= s.length() || s.charAt(i) != c) return stringBuilder.toString();
                stringBuilder.append(c);
            }
        }

        return stringBuilder.toString();
    }
}
