package com.jilingy.deep.learning.base.middle;

/**
 * @Description 反转链表
 * @Author Jiling Yang
 * @Date 2023/5/5 10:12
 */
public class ReverseLinkedList {

    /**
     * Definition for singly-linked list.
     * public class ListNode {
     * int val;
     * ListNode next;
     * ListNode() {}
     * ListNode(int val) { this.val = val; }
     * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     * }
     */
    public static class ListNode {

        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }


    public static ListNode reverseList(ListNode head) {
        ListNode dump = null;
        while (head != null) {
            ListNode middle = head.next;
            head.next = dump;
            dump=head;
            head=middle;
        }
        return dump;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);
        l1.next.next.next = new ListNode(1);
        l1.next.next.next.next = null;
        System.out.println(reverseList(l1));


    }


}
