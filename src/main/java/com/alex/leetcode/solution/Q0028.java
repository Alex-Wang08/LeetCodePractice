package com.alex.leetcode.solution;

/**
 * Implement strStr().
 *
 * Return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.
 *
 * Example 1:
 *
 * Input: haystack = "hello", needle = "ll"
 * Output: 2
 * Example 2:
 *
 * Input: haystack = "aaaaa", needle = "bba"
 * Output: -1
 *
 * author: Mr.Wang
 * @date 10/28/2019
 */
public class Q0028 {

    // may consider using KMP later
    public int strStr(String haystack, String needle) {
        if (needle == null || needle.length() == 0) return 0;

        for (int i = 0; i < haystack.length(); i++) {
            for (int j = 0; j < needle.length(); j++) {
                if (haystack.charAt(i + j) != needle.charAt(j)) break;

                if (j == needle.length() - 1) return i;
            }
        }

        return -1;
    }
}