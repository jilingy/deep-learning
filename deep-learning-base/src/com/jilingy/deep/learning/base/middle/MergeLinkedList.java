package com.jilingy.deep.learning.base.middle;

public class MergeLinkedList {

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


    public static ListNode merge(ListNode list1, ListNode list2) {
        ListNode head =new ListNode(0);
        ListNode result = head;

        while(list1!=null && list2!=null){
            if(list1.val<list2.val){
                head.next = list1;
                list1=list1.next;
                head=head.next;
            }else{
                head.next = list2;
                list2=list2.next;
                head=head.next;
            }
        }
         if(list1!=null){
             head.next=list1;
         }
         if(list2!=null){
             head.next=list2;
         }
        return result.next;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(2);
        l1.next.next = new ListNode(4);
        ListNode l2 = new ListNode(1);
        l2.next = new ListNode(3);
        l2.next.next = new ListNode(4);
        System.out.println(merge(l1, l2));


    }


}
