package com.alex.leetcode.solution;

import com.alex.leetcode.solution.com.alex.leetcode.BaseTest;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.*;

public class Q0216Test extends BaseTest {

    private Q0216 q0216;

    @Before
    public void before() {
        q0216 = new Q0216();
    }

    @Test
    public void combinationSum3() {
        int[][] res = generateArrayFromList(q0216.combinationSum3(3, 7));
        int[][] exp = new int[1][3];
        exp[0][0] = 1;
        exp[0][1] = 2;
        exp[0][2] = 4;

        assertArrayEquals(res, exp);
    }
}