public class DesignBrowserHistory1472 {

    class ListNode {
        ListNode prev;
        ListNode next;
        String str;
        ListNode(String str) {
            this.str = str;
            this.prev = null;
            this.next = null;
        }
    }
    ListNode curr;
    public DesignBrowserHistory1472 (String homepage) {
        this.curr = new ListNode(homepage);
    }

    public void visit(String url) {
        ListNode node = new ListNode(url);
        curr.next = node;
        node.prev = curr;
        curr = curr.next;
    }

    public String back(int steps) {
        while (curr.prev != null && steps-- > 0) {
            curr = curr.prev;
        }
        return curr.str;
    }

    public String forward(int steps) {
        while (curr.prev != null && steps-- > 0) {
            curr = curr.next;
        }
        return curr.str;
    }
}
