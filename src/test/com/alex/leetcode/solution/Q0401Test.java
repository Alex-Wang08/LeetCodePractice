package com.alex.leetcode.solution;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Set;

import static org.junit.Assert.*;

public class Q0401Test {

    private Q0401 q0401;

    @Before
    public void before() {
        q0401 = new Q0401();
    }

    @Test
    public void readBinaryWatch() {
        String[] res = new String[] {"1:00", "2:00", "4:00", "8:00", "0:01", "0:02", "0:04", "0:08", "0:16", "0:32"};
        List<String> list = q0401.readBinaryWatch(1);
        String[] res1 = list.toArray(new String[0]);

        Arrays.sort(res);
        Arrays.sort(res1);

        assertArrayEquals(res, res1);
    }
}