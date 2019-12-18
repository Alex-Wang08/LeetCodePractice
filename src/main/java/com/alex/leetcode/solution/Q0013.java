package com.alex.leetcode.solution;

import java.util.HashMap;
import java.util.Map;

public class Q0013 {
    public int romanToInt(String s) {
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        char[] chars = s.toCharArray();
        int res = 0;
        for (int i = 1; i <= chars.length; i++) {
            if (i == chars.length || map.get(chars[i - 1]) >= map.get(chars[i])) {
                res = res + map.get(chars[i - 1]);
            } else {
                res = res - map.get(chars[i - 1]);
            }
        }

        return res;
    }
}