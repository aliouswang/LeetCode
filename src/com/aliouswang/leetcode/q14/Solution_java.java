package com.aliouswang.leetcode.q14;

/**
 * Created by aliouswang on 2017/10/18.
 */
public class Solution_java {

    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";
        StringBuilder sBuilder = new StringBuilder();
        String firstStr = strs[0];
        int firstLen = firstStr.length();
        boolean needBreak = false;
        for (int i = 0; i < firstLen; i++) {
            char ch = firstStr.charAt(i);
            sBuilder.append(ch);
            String prefix = sBuilder.toString();
            for (int j = 1; j < strs.length; j++) {
                if(!strs[j].startsWith(prefix)) {
                    sBuilder.deleteCharAt(i);
                    needBreak = true;
                    break;
                }
            }
            if (needBreak) break;
        }
        return sBuilder.toString();
    }

}
