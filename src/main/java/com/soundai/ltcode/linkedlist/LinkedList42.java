package com.soundai.ltcode.linkedlist;

import com.soundai.ltcode.ListNode;

import java.util.Stack;

/**
 * @author: liujialei
 * @create: 2020-03-02 17:06
 **/
public class LinkedList42 {

    public static void main(String[] args) {
        LinkedList42 linkedList42 = new LinkedList42();
        ListNode head1 = new ListNode(1);
        ListNode head2 = new ListNode(2);
        ListNode head3 = new ListNode(3);
        ListNode head4 = new ListNode(4);
        ListNode head5 = new ListNode(5);
        head1.next = head2;
        head2.next = head3;
        head3.next = head4;
        head4.next = head5;
        ListNode listNode = linkedList42.removeNthFromEnd(head1, 2);
        System.out.println(listNode);
    }


    public ListNode removeNthFromEnd(ListNode head, int n) {
        Stack<Integer> stack = new Stack<>();
        while (head != null) {
            stack.push(head.val);
            head = head.next;
        }
        ListNode ret = null;
        while (!stack.empty()) {
            if ( --n  == 0) {
                stack.pop();
                continue;
            }
            ListNode temp = new ListNode(stack.pop());
            temp.next = ret;
            ret = temp;
        }

        return ret;
    }

}
