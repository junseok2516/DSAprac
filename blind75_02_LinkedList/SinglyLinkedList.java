import java.util.List;

public class SinglyLinkedList {
    ListNode head;
    ListNode tail;
    public SinglyLinkedList() {
        this.head = new ListNode(-1);
        this.tail = head;
    }

    public void insertEnd(ListNode node) {
        tail.next = node;
        tail = node;
    }

    public void remove(int index) {
        int cnt = 0;
        ListNode curr = head;
        while (cnt < index && curr.next != null) {
            cnt++;
            curr = curr.next;
        }

        if (curr.next != null) {
            curr.next = curr.next.next;
        }
    }

    public void print() {
        int cnt = 0;
        ListNode curr = head;
        while (curr != null) {
            System.out.print(curr.val + "->");
            curr = curr.next;
        }
        System.out.println();
    }
}

class ListNode {
    int val;
    ListNode next;
    public ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}
