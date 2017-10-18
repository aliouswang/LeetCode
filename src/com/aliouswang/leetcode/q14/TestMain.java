package com.aliouswang.leetcode.q14;

/**
 * Created by aliouswang on 2017/10/18.
 */
public class TestMain {

    /**
     * Question :
     *
     * Write a function to find the longest common prefix string amongst an array of strings.
     *
     */

    public static void main(String[] args) {

        String[] strings = {
                "12345",
                "123",
                "1234567"
        };

        System.out.println(Solution_kotlinKt.longestCommonPrefix(strings));
        System.out.println(new Solution_java().longestCommonPrefix(strings));
    }

}
