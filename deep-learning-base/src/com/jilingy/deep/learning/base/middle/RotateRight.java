package com.jilingy.deep.learning.base.middle;

/**
 * @Description
 * @Author Jiling Yang
 * @Date 2023/5/10 20:40
 */
public class RotateRight {
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

    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode slow = head;
        int count = 0;
        while (slow != null) {
            count++;
            if (slow.next == null) {
                slow.next = head;
                break;
            }
            slow = slow.next;
        }

        for (int i = 0; i < count-k % count; i++) {
            head = head.next;
        }
        ListNode newHead = head;
        ListNode resultHead = head;

        for (int i = count-1; i < count; i--) {
            if (i==0){
                newHead.next = null;
                break;
            }
            newHead = newHead.next;
        }
        return resultHead;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(2);
        l1.next.next = new ListNode(3);
        l1.next.next.next = new ListNode(4);
        l1.next.next.next.next = new ListNode(5);
//        l1.next.next.next.next  = new ListNode(3);
        l1.next.next.next.next.next = null;
        new RotateRight().rotateRight(l1, 2);
    }

}
