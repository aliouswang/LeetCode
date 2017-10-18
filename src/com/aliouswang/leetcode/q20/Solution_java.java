package com.aliouswang.leetcode.q20;

import java.util.Stack;

/**
 * Created by aliouswang on 2017/10/18.
 */
public class Solution_java {

    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        char[] chars = s.toCharArray();
        for (char ch : chars) {
            if (ch == '{' || ch == '[' || ch == '(') {
                stack.push(ch);
            }else if (ch == '}') {
                if (stack.isEmpty()) return false;
                char pre = stack.pop();
                if (pre != '{') return false;
            }else if (ch == ']') {
                if (stack.isEmpty()) return false;
                char pre = stack.pop();
                if (pre != '[') return false;
            }else if (ch == ')') {
                if (stack.isEmpty()) return false;
                char pre = stack.pop();
                if (pre != '(') return false;
            }
        }
        return stack.size() == 0;
    }

}
