package com.soundai.algo;

import java.util.Stack;

public class ReverseLinkedList206 {

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(3);
        ListNode l4 = new ListNode(4);
        ListNode l5 = new ListNode(5);
        ListNode l6 = new ListNode(6);
        l1.next = l2;
        l2.next = l3;
        l3.next = l4;
        l4.next = l5;
        //l5.next = l6;
        //l6.next = l1;

        ReverseLinkedList206 reverseLinkedList206 = new ReverseLinkedList206();

        reverseLinkedList206.reverseList(l1);

    }

    public ListNode reverseListBatter (ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode cur = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return cur;
    }

    public ListNode reverseList(ListNode head) {
        Stack<ListNode> listNodes = new Stack<>();

        ListNode faster = head.next;
        ListNode slower = head;

        while (true) {
            if (faster == slower) {
                listNodes.add(slower);
                break;
            }
            if (slower == head && !listNodes.empty()) {
                break;
            }
            if (faster == null || faster.next == null || faster.next.next == null) {
                break;
            }
            listNodes.push(slower);
            faster = faster.next.next;
            slower = slower.next;
        }



        if (faster == null || faster.next == null || faster.next.next == null) {
            while (slower != null) {
                listNodes.push(slower);
                slower = slower.next;
            }
            //stright
            ListNode ret = getSubListNode(listNodes, null);
            return ret;
        } else {

            //recycle
            ListNode ret = getSubListNode(listNodes, listNodes.peek());
            return ret;

        }
    }

    private ListNode getSubListNode (Stack<ListNode> listNodes, ListNode head) {

        while (!listNodes.empty()) {
            ListNode ln = listNodes.pop();
            ln.next = getSubListNode(listNodes, head);
            return ln;
        }
        return head;

    }

}
