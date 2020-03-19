package com.soundai.algo;

public class PalindromeLindedList234 {


    public static void main(String[] args) {
        ListNode listNode1 = new ListNode(1);
        ListNode listNode2 = new ListNode(3);
        ListNode listNode3 = new ListNode(0);
        ListNode listNode4 = new ListNode(2);
        listNode1.next = listNode2;
        listNode2.next = listNode3;
        listNode3.next = listNode4;
        PalindromeLindedList234 palindromeLindedList234 = new PalindromeLindedList234();
        System.out.println(palindromeLindedList234.isPalindrome(listNode1));
    }

    public boolean isPalindrome(ListNode head) {
        //记得熟练应用异或的交换律，两个相同的数异或是0，0异或任意数字是它本身
        int temp = 0;
        int ret = 0;
        ListNode tmpNode = head;
        while (tmpNode != null) {
            int posOrNeg = (++temp) / 2 == 0 ? 1 : -1;
            temp += posOrNeg * tmpNode.val;
            tmpNode = tmpNode.next;
        }
        return temp == 0 && temp / 2 == 0 ;
    }

}
