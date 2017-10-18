package com.aliouswang.leetcode.q20;

/**
 * Created by aliouswang on 2017/10/18.
 */
public class TestMain {

    public static void main(String[] args) {
        String testString = "{{{[[[((()))]]]}}}";
        System.out.println(new Solution_java().isValid(testString));
        System.out.println(new Solution_kotlin().isValid(testString));
    }

}
