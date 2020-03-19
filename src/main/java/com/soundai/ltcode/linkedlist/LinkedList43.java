package com.soundai.ltcode.linkedlist;

import com.soundai.ltcode.ListNode;

import java.util.Stack;

/**
 * @author: liujialei
 * @create: 2020-03-02 18:26
 **/
public class LinkedList43 {


    public static void main(String[] args) {
        LinkedList43 linkedList43 = new LinkedList43();
        ListNode head = new ListNode(1);
        ListNode head1 = new ListNode(2);
        ListNode head2 = new ListNode(3);
        ListNode head3 = new ListNode(4);
        ListNode head4 = new ListNode(5);

        head.next = head1;
        head1.next = head2;
        head2.next = head3;
        head3.next = head4;

        ListNode listNode = linkedList43.reverseList(head);
        System.out.println(listNode.val);
    }

    public ListNode reverseList(ListNode head) {
        if (head == null) {
            return null;
        }
        Stack<Integer> stack = new Stack();
        while (head != null) {
            stack.push(head.val);
            head = head.next;
        }
        ListNode retHeader = new ListNode(0);
        ListNode lastNode = new ListNode(stack.pop());
        retHeader.next = lastNode;

        while (!stack.empty()) {
            lastNode.next = new ListNode(stack.pop());
            lastNode = lastNode.next;

        }
        return retHeader.next;
    }

}
