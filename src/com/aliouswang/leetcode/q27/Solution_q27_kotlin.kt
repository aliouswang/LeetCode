package com.aliouswang.leetcode.q27

/**
 * Created by aliouswang on 2017/10/19.
 */

class Solution_q27_kotlin {

    fun removeElement(nums: IntArray, value: Int) : Int {
        if (nums.isEmpty()) return 0
        val len = nums.size
        var newLen = len
        for (i in len - 1 downTo 0) {
            if (value == nums[i]) {
                for (j in i until newLen) {
                    if (j < newLen - 1) {
                        nums[j] = nums[j + 1]
                    }else {
                        nums[j] = value + 1
                    }
                }
                newLen--
            }
        }
        return newLen
    }

    fun testForLoop(total : Int) {
        System.out.println("++++")
        for (i in 0 until total) {
            System.out.println(i)
        }
        System.out.println("----")
        for (i in total - 1 downTo  0) {
            System.out.println(i)
        }
    }


}
