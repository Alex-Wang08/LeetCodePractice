package com.alex.leetcode.solution;

/**
 * Determine whether an integer is a palindrome.
 * An integer is a palindrome when it reads the same backward as forward.
 *
 * example1:
 * Input: 121
 * Output: true
 *
 * Input: -121
 * Output: false
 *
 * author: Mr.Wang
 * @date 10/27/2019
 */
public class Q0009 {
    public boolean isPalindrome(int x) {
       if (x < 0 || x > 0 && x % 10 == 0) return false;

       int reversedX = 0;
       while (x > reversedX) { // no need to go through each digit of x, but only half of x's digits
           reversedX = reversedX * 10 + x % 10;
           x = x / 10;
       }

       return x == reversedX || // even digits
               x == reversedX / 10; // odd digit
    }
}
