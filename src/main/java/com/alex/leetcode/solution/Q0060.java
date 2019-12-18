package com.alex.leetcode.solution;

import java.util.ArrayList;
import java.util.List;

public class Q0060 {
    public static void main(String[] args) {
        Q0060 q0060 = new Q0060();
        String res = q0060.getPermutation(9, 155915);
        System.out.println(res);
    }


    public String getPermutation(int n, int k) {
        List<String> list = new ArrayList<>();
        generatePermutation(list, n, new StringBuilder(""), new boolean[n]);

        return k > list.size()? null : list.get(k - 1);

    }

    private void generatePermutation(List<String> list,
                                     int n,
                                     StringBuilder sb,
                                     boolean[] used) {
        if (sb.length() == n) {
            list.add(sb.toString());
            return;
        }

        for (int i = 0; i < n; i++) {
            if (used[i]) continue;

            sb.append(i + 1);
            used[i] = true;
            generatePermutation(list, n, sb, used);
            sb.deleteCharAt(sb.length() - 1);
            used[i] = false;
        }
    }




}
