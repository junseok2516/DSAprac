import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class MinStack155 {
    class MinStack {
        List<Integer> stack;
        int min = Integer.MAX_VALUE;

        public MinStack() {
            stack = new LinkedList<>();
        }

        public void push(int val) {
            if (min >= val) {
                stack.add(min);
                min = val;
            }
            stack.add(val);
        }

        public void pop() {
            if (stack.removeLast() == min) {
                min = stack.removeLast();
            }
        }

        public int top() {
            return stack.getLast();
        }

        public int getMin() {
            return min;
        }
    }

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
}
