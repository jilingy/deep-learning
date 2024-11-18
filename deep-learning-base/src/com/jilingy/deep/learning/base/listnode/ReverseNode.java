package listnode;

/**
 * @Description
 * @Author Jiling Yang
 * @Date 2024/11/18 21:30
 */
public class ReverseNode {
    public static ListNode reverseList(ListNode head) {
        if (head == null) {
            return head;
        }
        ListNode dummy = null;
        while (head != null) {
            ListNode mid = head.next;
            head.next = dummy;
            dummy = head;
            head = mid;
        }
        return dummy;
    }


    public static void main(String[] args) {
        ListNode head1 = new ListNode(1);
        ListNode head2 = new ListNode(2);
        ListNode head3 = new ListNode(3);
        head1.next = head2;
        head2.next = head3;
        head3.next = null;
        System.out.println(reverseList(head1));
    }
}
