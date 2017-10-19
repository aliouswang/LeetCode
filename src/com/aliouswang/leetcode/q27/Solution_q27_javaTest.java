package com.aliouswang.leetcode.q27;

import junit.framework.TestCase;

import java.util.Arrays;

/**
 * Created by aliouswang on 2017/10/19.
 */
public class Solution_q27_javaTest extends TestCase {
    @org.junit.Before
    public void setUp() throws Exception {
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

    @org.junit.Test
    public void test() throws Exception {
        Solution_q27_kotlin solution = new Solution_q27_kotlin();
        int[] nums = {3, 2, 2, 3};
        int[] expectResult = {2, 2};
        solution.removeElement(nums, 3);
        System.out.println(Arrays.toString(nums));

        solution.testForLoop(3);
    }

}