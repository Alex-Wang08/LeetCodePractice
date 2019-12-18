package com.alex.leetcode.solution;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Q0290 {


    public boolean wordPattern(String pattern, String str) {
        String[] strings = str.split(" ");
        Map<Character, String> map = new HashMap<>();
        Set<String> set = new HashSet<>();

        for (int i = 0; i < pattern.length(); i++) {
            char c = pattern.charAt(i);
            String s =strings[i];

            if (map.containsKey(c)) {
                if (!map.get(c).equals(s)) return false;
            } else {
                if (set.contains(s)) return false;
                else {
                    map.put(c, s);
                    set.add(s);
                }
            }
        }

        return true;
    }
}
