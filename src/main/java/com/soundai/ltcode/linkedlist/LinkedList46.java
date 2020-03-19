package com.soundai.ltcode.linkedlist;

import com.soundai.ltcode.ListNode;

/**
 * @author: liujialei
 * @create: 2020-03-03 11:29
 **/
public class LinkedList46 {

    public static void main(String[] args) {
        LinkedList46 linkedList46 = new LinkedList46();
        ListNode head = new ListNode(1);
        ListNode head1 = new ListNode(2);
        ListNode head2 = new ListNode(3);
        ListNode head3 = new ListNode(4);
        ListNode head4 = new ListNode(5);
        head.next = head1;
        head1.next = head2;
        head2.next = head3;
        head3.next = head4;
        System.out.println(linkedList46.hasCycle(head));
    }

    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) {
            return false;
        }
        ListNode bak = head;
        ListNode pre = head;
        while (pre.next != null && pre.next.next != null) {
            bak = bak.next;
            pre = pre.next.next;
            if (pre == bak) {
                return true;
            }
        }
        return false;
    }

}
