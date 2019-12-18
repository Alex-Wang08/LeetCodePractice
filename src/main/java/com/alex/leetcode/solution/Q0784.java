package com.alex.leetcode.solution;

import java.util.ArrayList;
import java.util.List;

public class Q0784 {

//    @Override
//    public void test() {
//        String s = "a1b1";
//        letterCasePermutation(s);
//
//        System.out.println("done");
//    }

    public List<String> letterCasePermutation(String S) {
        List<String> list = new ArrayList<>();
        helper(list, 0, new StringBuilder(S));

        return list;
    }

    private void helper(List<String> list, int start, StringBuilder sb) {
        if (start >= sb.length()) {
            list.add(sb.toString());
            return;
        }
        helper(list, start + 1, sb);
        char c = sb.charAt(start);
        if (c >= 'a' && c <= 'z') {
            sb.setCharAt(start, (char) (c - 'a' + 'A'));
            helper(list, start + 1, sb);
        } else if (c >= 'A' && c <= 'Z') {
            sb.setCharAt(start, (char) (c - 'A' + 'a'));
            helper(list, start + 1, sb);
        }
    }
}
