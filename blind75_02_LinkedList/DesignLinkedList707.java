public class DesignLinkedList707 {
    ListNode head;
    ListNode tail;

    class ListNode {
        ListNode next;
        ListNode prev;
        int val;
        ListNode(int val) {
            this.val = val;
            this.next = null;
            this.prev = null;
        }
    }
    public DesignLinkedList707() {
        this.head = new ListNode(-1);
        this.tail = new ListNode(-1);
        head.next = tail;
        tail.prev = head;
    }

    public int get(int index) {
        ListNode curr = head;
        for (int i = 0; i < index; i++) {
            curr = curr.next;
        }
        return curr.val;
    }

    public void addAtHead(int val) {
        ListNode node = new ListNode(val);
        node.next = head;
        head.prev = node;
        head = node;
    }

    public void addAtTail(int val) {
        ListNode node = new ListNode(val);
        tail.next = node;
        node.prev = tail;
        tail = node;
    }

    public void addAtIndex(int index, int val) {
        ListNode node = new ListNode(val);
        ListNode curr = head;
        if (index == 0) {
            head.prev = node;
            node.next = head;
            head = node;
        } else {
            for (int i = 0; i < index; i++) {
                curr = curr.next;
            }
            curr.prev.next = node;
            node.prev = curr.prev;
            node.next = curr;
            curr.prev = node;
        }
    }

    public void deleteAtIndex(int index) {
        ListNode curr = head;
        if (index == 0) {
            head.next.prev = null;
        } else {
            for (int i = 0; i < index; i++) {
                curr = curr.next;
            }
            curr.prev.next = curr.next;
            curr.next.prev = curr.prev;
        }
    }
}
/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */