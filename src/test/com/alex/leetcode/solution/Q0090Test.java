package com.alex.leetcode.solution;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class Q0090Test {

    private Q0090 q0090;

    @Before
    public void before() {
        q0090 = new Q0090();
    }

    @Test
    public void subsetsWithDup() {
        int[] nums = new int[] {1, 2, 2};

        List<List<Integer>> lists = q0090.subsetsWithDup(nums);


    }
}