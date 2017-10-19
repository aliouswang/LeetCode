package com.aliouswang.leetcode.q27;

/**
 * Created by aliouswang on 2017/10/19.
 */
public class Solution_q27_java {

    public int removeElement(int[] nums, int val) {
        if (nums == null || nums.length == 0) return 0;
        int len = nums.length;
        int newLen = len;
        for (int i = len - 1; i >= 0; i--) {
            if (val == nums[i]) {
                for (int j = i; j < newLen; j++) {
                    if (j + 1 < newLen) {
                        nums[j] = nums[j + 1];
                    }else {
                        nums[j] = val + 1;
                    }
                }
                newLen--;
            }
        }
        return newLen;
    }


}
