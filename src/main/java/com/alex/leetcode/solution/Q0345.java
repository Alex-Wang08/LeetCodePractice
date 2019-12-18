package com.alex.leetcode.solution;

public class Q0345 {
    public static void main(String[] args) {
        Q0345 q0345 = new Q0345();
        q0345.reverseVowels("Hello");
    }





    public String reverseVowels(String s) {
        char[] chars = s.toCharArray();
        int prev = -1;

        for (int i = 0; i < chars.length; i++) {
            if (isVowel(chars[i])) {
                if (prev != -1) {
                    char temp = chars[prev];
                    chars[prev] = chars[i];
                    chars[i] = temp;
                }
                prev = i;
            }
        }

        return new String(chars);
    }

    private boolean isVowel(char c) {
        return c == 'a' ||
                c == 'e' ||
                c == 'i' ||
                c == 'o' ||
                c == 'u';
    }
}
