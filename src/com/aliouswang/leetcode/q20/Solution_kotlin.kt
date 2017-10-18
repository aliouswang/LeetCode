package com.aliouswang.leetcode.q20

import java.util.*

/**
 * Created by aliouswang on 2017/10/18.
 */

class Solution_kotlin {

    fun isValid(s : String) : Boolean {
        val stack = Stack<Char>()
        for (ch in s.toCharArray()) {
            when (ch) {
                '{' -> stack.push('}')
                '[' -> stack.push(']')
                '(' -> stack.push(')')
                '}', ']', ')' -> {
                    if (stack.isEmpty() || stack.pop() != ch) return false
                }
            }
        }
        return stack.empty()
    }

}
