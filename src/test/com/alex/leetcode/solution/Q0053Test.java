package com.alex.leetcode.solution;

import org.junit.Before;
import org.junit.Test;
import org.junit.runners.JUnit4;

import static org.junit.Assert.*;

public class Q0053Test {
    private Q0053 q0053;

    @Before
    public void before() {
        q0053 = new Q0053();

    }

    @Test
    public void maxSubArray() {
        int[] nums = new int[] {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        assertEquals(6, q0053.maxSubArray(nums));
    }
}