package linked.list;

// https://leetcode.com/problems/reverse-linked-list/
public class ReverseLinkedList {
    // TC: O(n)
    // MC: O(1)
    public ListNode reverseList(ListNode head) {
        ListNode current = head;
        ListNode prev = null;
        ListNode next = null;

        while (current != null) {
            if (current.next == null) {
                current.next = prev;
                return current;
            }

            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        head = current;
        return head;
    }

}
