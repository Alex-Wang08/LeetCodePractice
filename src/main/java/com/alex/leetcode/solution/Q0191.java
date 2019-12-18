package com.alex.leetcode.solution;

/**
 * Write a function that takes an unsigned integer and return the number
 * of '1' bits it has (also known as the Hamming weight).
 * author: Mr.Wang
 * @date 10/20/2019
 */
public class Q0191 {

    /**
     * @param n an unsigned integer
     * @return the number of 1 bits
     * loop through all the possible digits (32) using a mask to check if a certain digit is 1 or 0
     */
    public int hammingWeight(int n) {
        int sum = 0;
        int mask = 1;
        for (int i = 0; i < 32; i++) {
            if ((n & mask) != 0) sum++;
            mask = mask << 1;
        }

        return sum;
    }


    /**
     * @param n an unsigned integer
     * @return the number of 1 bits
     * using n & (n - 1) to turn the last '1' bit to '0'
     */
    public int hammingWeight1(int n) {
        int sum = 0;
        while (n != 0) {
            sum++;
            n = n & (n - 1);
        }

        return sum;
    }
}