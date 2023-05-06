package com.jilingy.deep.learning.base.test;

public class LinkedList {
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

    public ListNode reverseList(ListNode head) {
        ListNode previous = null;
        ListNode current = head;
        while(current!=null){
            ListNode tempt = current.next;
            current.next=previous;

            previous=current;
            current=tempt;
        }
        return previous;

    }

    public static void main(String[] args) {
        ListNode one = new ListNode(1);
        ListNode two = new ListNode(2);
        ListNode three = new ListNode(3);
        one.next=two;
        one.next.next=three;
        System.out.println(one.val+"+"+one.next.val+"+"+one.next.next.val);

        new LinkedList().reverseList(one);
        System.out.println(one.val+"+"+one.next.val+"+"+one.next.next.val);


    }
}
