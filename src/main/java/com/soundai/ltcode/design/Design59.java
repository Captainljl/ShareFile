package com.soundai.ltcode.design;

import java.util.Stack;

/**
 * @author: liujialei
 * @create: 2020-03-18 15:55
 **/
public class Design59 {

    private Stack<Integer> dataStack;
    private Stack<Integer> minStack;

    /** initialize your data structure here. */
    public Design59() {
        dataStack = new Stack<> ();
        minStack = new Stack<>();
    }

    public void push(int x) {
        dataStack.push(x);
        minStack.push(Math.min((minStack.isEmpty() ? x : minStack.peek()), x));
    }

    public void pop() {
        dataStack.pop();
        minStack.pop();
    }

    public int top() {
        return dataStack.peek();
    }

    public int getMin() {
        return minStack.peek();
    }

    public static void main(String[] args) {
        Design59 design59 = new Design59();
        design59.push(-2);
        design59.push(0);
        design59.push(-3);
        design59.pop();

        System.out.println(design59.getMin());
    }

}
