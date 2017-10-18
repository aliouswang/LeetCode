package com.aliouswang.leetcode.q33;

/**
 * Created by aliouswang on 2017/10/18.
 */
public class Solution_q33_java {

    public int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length;
        int mid = 0;
        while(start < end) {
            mid = (end - start) / 2;
            if (nums[mid] == target) return mid;

            if (nums[start] <= nums[mid]) {
                if (target >= nums[start] && target < nums[mid]) {
                    end = mid - 1;
                }else start = mid + 1;
            }

            if (nums[end] >= nums[mid]) {
                if (target > nums[mid] && target <= nums[end]) {
                    start = mid + 1;
                }else {
                    end = mid - 1;
                }
            }
        }
        return -1;
    }

}
