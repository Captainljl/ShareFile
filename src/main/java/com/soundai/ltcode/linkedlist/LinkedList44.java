package com.soundai.ltcode.linkedlist;

import com.soundai.ltcode.ListNode;

/**
 * @author: liujialei
 * @create: 2020-03-03 09:39
 **/
public class LinkedList44 {

    public static void main(String[] args) {
        LinkedList44 linkedList44 = new LinkedList44();
        ListNode l1 = new ListNode(1);
        ListNode l11 = new ListNode(2);
        ListNode l12 = new ListNode(3);
        ListNode l13 = new ListNode(4);

        l1.next = l11;
        l11.next = l12;
        l12.next = l13;


        ListNode l2 = new ListNode(2);
        ListNode l21 = new ListNode(4);
        ListNode l22 = new ListNode(5);
        ListNode l23 = new ListNode(6);
        l2.next = l21;
        l21.next = l22;
        l22.next = l23;


        ListNode listNode = linkedList44.mergeTwoLists(l1, l2);
        System.out.println(listNode);
    }


    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        }
        if (l2 == null) {
            return l1;
        }
        ListNode retHead = new ListNode(0);
        ListNode temp = new ListNode(1);
        retHead.next = temp;
        while (l1 != null && l2 != null ) {
            if (l1.val <= l2.val) {
                temp.next = new ListNode(l1.val);
                temp = temp.next;
                l1 = l1.next;
            } else {
                temp.next = new ListNode(l2.val);
                temp = temp.next;
                l2 = l2.next;
            }
        }
        if (l1 != null) {
            temp.next = l1;
        }
        if (l2 != null) {
            temp.next = l2;
        }
        return retHead.next.next;
    }

}
