package com.soundai.threemonths.topic5;

import java.util.Stack;

/**
 * @author: liujialei
 * @create: 2020-01-02 09:36
 **/
public class Solution {
    /**
     * 用两个栈实现一个队列。
     * 队列声明如下，请实现它的两个函数appendTail和deleteHead，
     * 分别完成在队列尾部插入节点和在队列头部删除节点的功能。
     */

    private Stack stack1 = new Stack();
    private Stack stack2 = new Stack();

    public void appendTail(Object o) {
        stack1.push(o);
    }

    public void deleteHead() {
        while (stack1.peek() != null) {
            stack2.push(stack1.pop());
        }
        stack2.pop();
        while (stack2.peek() != null) {
            stack1.push(stack2.pop());
        }
    }

}
