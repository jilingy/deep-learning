package com.jilingy.deep.learning.base.middle;

public class CycleLinkedList {

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


    public static boolean hasCycle(ListNode head) {
        if (head ==null){return false;}
        ListNode slow = head;
        ListNode fast = head;

        while (slow.next != null && fast.next != null&& fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(-1);
         l1.next = new ListNode(-2);
        System.out.println(hasCycle(l1));


    }


}
