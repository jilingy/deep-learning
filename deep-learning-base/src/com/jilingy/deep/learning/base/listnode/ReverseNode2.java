package listnode;

/**
 * @Description
 * @Author Jiling Yang
 * @Date 2024/11/18 21:30
 */
public class ReverseNode2 {
    public static ListNode reverseBetween(ListNode head, int left, int right) {
        // 因为头节点有可能发生变化，使用虚拟头节点可以避免复杂的分类讨论
        ListNode dummyNode = new ListNode(-1);
        dummyNode.next = head;
        ListNode pre =dummyNode;
        for (int i = 0; i < left-1; i++) {
            pre = pre.next;
        }
        ListNode leftnode = pre.next;

        ListNode rightnode = pre;
        for (int i = left; i < right+1; i++) {
            rightnode = rightnode.next;
        }
        ListNode lastnode = rightnode.next;

        pre.next = null;
        rightnode.next = null;

        reverseLinkedList(leftnode);
        pre.next = rightnode;
        leftnode.next = lastnode;
        return dummyNode.next;
    }

    public static void reverseLinkedList(ListNode head) {
        ListNode pre = null;
        ListNode cur = head;

        while (cur != null) {
            ListNode next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
    }

    public static void main(String[] args) {
        ListNode head1 = new ListNode(1);
        ListNode head2 = new ListNode(2);
        ListNode head3 = new ListNode(3);
        ListNode head4 = new ListNode(4);
        ListNode head5 = new ListNode(5);
        head1.next = head2;
        head2.next = head3;
        head3.next = head4;
        head4.next = head5;
        head5.next = null;
        System.out.println(reverseBetween(head1, 2, 4));
    }

}
