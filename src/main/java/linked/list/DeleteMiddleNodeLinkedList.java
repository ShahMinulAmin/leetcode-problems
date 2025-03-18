package linked.list;

// https://leetcode.com/problems/delete-the-middle-node-of-a-linked-list/

class ListNode {
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class DeleteMiddleNodeLinkedList {
    // TC: O(n)
    // MC: O(1)
    public ListNode deleteMiddle(ListNode head) {
        if (head == null || head.next == null) {
            return null;
        }

        ListNode prevRunner = null;
        ListNode slowRunner = head;
        ListNode fastRunner = head;
        while (fastRunner != null && fastRunner.next != null) {
            prevRunner = slowRunner;
            slowRunner = slowRunner.next;
            fastRunner = fastRunner.next.next;
        }

        prevRunner.next = slowRunner.next;
        return head;
    }

}
