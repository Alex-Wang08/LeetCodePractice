package com.alex.leetcode.solution;


import java.util.ArrayList;
import java.util.List;

/**
 * A binary watch has 4 LEDs (8, 4, 2, 1) on the top which represent the hours (0-11),
 * and the 6 LEDs (32, 16, 8, 4, 2, 1) on the bottom represent the minutes (0-59).
 * Each LED represents a zero or one, with the least significant bit on the right.
 *
 * Given a non-negative integer n which represents the number of LEDs that are currently on,
 * return all possible times the watch could represent.
 * author: Mr.Wang
 * @date 10/20/2019
 */

public class Q0401 {


    /**
     * @param num the number of LEDs that are currently on
     * @return all possible times the watch could represent
     * using Integer.bitCount(int n) to calculate how many bit '1' (which means LED is on) needed to represent n
     * loop through all possible times and select the match the input num.
     */
    public List<String> readBinaryWatch(int num) {
        List<String> res = new ArrayList<>();
        for (int h = 0; h < 12; h++) {
            for (int m = 0; m < 60; m++) {
                if (Integer.bitCount(h) + Integer.bitCount(m) == num) {
                    res.add(h + ":" + (m < 10? "0" : "") + m);
                }
            }
        }

        return res;
    }
}
