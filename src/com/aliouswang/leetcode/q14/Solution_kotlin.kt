package com.aliouswang.leetcode.q14

/**
 * Created by aliouswang on 2017/10/18.
 */

fun longestCommonPrefix(strs: Array<String>) : String {
    if(strs.isEmpty()) return ""
    var pre = strs[0]
    var i = 1
    while(i < strs.size) {
        while(strs[i].indexOf(pre) != 0) {
            pre = pre.substring(0, pre.length - 1)
        }
        i++
    }
    return pre
}
