package com.alex.leetcode.solution;

import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class Q0118 {

    public static void main(String[] args) {
        Q0118 q0118 = new Q0118();
        q0118.generate(5);
        String s = "fsdfs";

        System.out.println("done");
    }

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> lists = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();

        for (int i = 1; i <= numRows; i++) {
            for (int j = 1; j < i - 1; j++) {
                temp.set(j, temp.get(j - 1) + temp.get(j));
            }

            temp.add(1);
            lists.add(new ArrayList<>(temp));
        }

        return lists;
    }
}
