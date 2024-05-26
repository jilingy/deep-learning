package com.jilingy.deep.learning.base.middle;

/**
 * @Description
 * @Author Jiling Yang
 * @Date 2023/5/10 20:40
 */
public class DeleteDuplicates {
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

    public ListNode deleteDuplicates(ListNode head) {
        if (head.next == null) {
            return head;
        }
        ListNode slow = head;
        while (slow != null && slow.next != null) {
            // 如果相等
            if (slow.val == slow.next.val) {
                slow.next= slow.next.next;
            } else {
                slow= slow.next;
            }
        }
        return head;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(1);
        l1.next.next = new ListNode(3);
//        l1.next.next.next = new ListNode(3);
//        l1.next.next.next.next  = new ListNode(3);
        l1.next.next.next = null;
        new DeleteDuplicates().deleteDuplicates(l1);
    }

}
