public class ReverseLinkedList206 {
    /**
     * Definition for singly-linked list.
     * public class ListNode {
     *     int val;
     *     ListNode next;
     *     ListNode() {}
     *     ListNode(int val) { this.val = val; }
     *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     * }
     */
    public ListNode reverseList(ListNode head) {
        ListNode curr = head; ListNode prev = null;
        while (curr != null) {
            ListNode tmpNextNode = curr.next;
            curr.next = prev;
            prev = curr;
            curr = tmpNextNode;
        }
        return prev;
    }
}
