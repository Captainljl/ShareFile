package com.soundai.ltcode.linkedlist;

import com.soundai.ltcode.ListNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: liujialei
 * @create: 2020-03-03 10:50
 **/
public class LinkedList45 {

    public static void main(String[] args) {
        LinkedList45 linkedList45 = new LinkedList45();
        ListNode head = new ListNode(-129);
        ListNode head2 = new ListNode(-129);
        ListNode head3 = new ListNode(3);
        ListNode head4 = new ListNode(1);
        head.next = head2;
        //head2.next = head3;
        //head3.next = head4;
        boolean palindrome = linkedList45.isPalindrome(head);
        System.out.println(palindrome);
    }

    public boolean isPalindrome(ListNode head) {
        List<Integer> list = new ArrayList<>();
        while (head != null) {
            list.add(head.val);
            head = head.next;
        }
        for (int i = 0; i < list.size() - 1 -i; i++) {
            if (!list.get(i).equals(list.get(list.size() - 1 -i))) {
                return false;
            }
        }
        return true;
    }

}
