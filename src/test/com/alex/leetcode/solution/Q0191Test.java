package com.alex.leetcode.solution;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class Q0191Test {

    private Q0191 q0191;

    @Before
    public void setUp() {
        q0191 = new Q0191();
    }

    @Test
    public void hammingWeight() {
        assertEquals(q0191.hammingWeight(11), 3);
    }

    @Test
    public void hammingWeight1() {
        assertEquals(q0191.hammingWeight1(11), 3);
    }
}