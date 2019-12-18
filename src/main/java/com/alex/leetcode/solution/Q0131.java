package com.alex.leetcode.solution;

import java.util.ArrayList;
import java.util.List;

public class Q0131 {

//    public List<List<String>> partition(String s) {
//        List<String> lists = new ArrayList<>();
//        createPartition(lists, new StringBuilder(""), s, 0);
//        return lists;
//
//    }
//
//    private void createPartition(List<String> lists,
//                                 StringBuilder temp,
//                                 String s,
//                                 int start) {
//        if (isPalindrome(temp)) {
//            lists.add(temp.toString());
//            return;
//        }
//
//        for (int i = start; i < s.length(); i++) {
//            temp.append(s.charAt(i));
//            createPartition(lists, temp, s, i + 1);
//            temp.deleteCharAt(temp.size() - 1);
//        }
//    }
//
//    private boolean isPalindrome(StringBuilder sb) {
//        int start = 0;
//        int end = sb.size() - 1;
//        while (start <= end) {
//            if (sb.charAt(start) != sb.charAt(end)) return false;
//            start++;
//            end--;
//        }
//
//        return true;
//    }
}
