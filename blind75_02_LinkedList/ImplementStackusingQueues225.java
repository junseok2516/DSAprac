import java.util.LinkedList;
import java.util.Queue;

public class ImplementStackusingQueues225 {
    private Queue<Integer> q;

    public ImplementStackusingQueues225() {
        q = new LinkedList<>();
    }

    public void push(int x) {
        q.add(x);
        for (int i = 1; i < q.size(); i++) {
            q.add(q.remove());
        }
    }

    public int pop() {
        return q.remove();
    }

    public int top() {
        return q.peek();
    }

    public boolean empty() {
        return q.isEmpty();
    }
}
