package com.soundai.ltcode.others;

import java.util.Stack;

/**
 * @author: liujialei
 * @create: 2020-03-10 11:09
 **/
public class Other68 {

    public static void main(String[] args) {
        Other68 other68  = new Other68();
        System.out.println(other68.isValid("()"));
    }

    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (stack.isEmpty()) {
                stack.push(c);
            } else {
                if (isPair(stack.peek(), c)) {
                    stack.pop();
                } else {
                    stack.push(c);
                }
            }
        }
        return stack.isEmpty();
    }


    private boolean isPair (char c1, char c2) {
        if (c1 == '(' && c2 == ')') {
            return true;
        }
        if (c1 == '[' && c2 == ']') {
            return true;
        }
        if (c1 == '{' && c2 == '}') {
            return true;
        }
        return false;
    }

}
