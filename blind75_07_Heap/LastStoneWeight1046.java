import java.util.Collections;
import java.util.PriorityQueue;

public class LastStoneWeight1046 {
    PriorityQueue<Integer> heap = new PriorityQueue<>(Collections.reverseOrder());
    public int lastStoneWeight(int[] stones) {
        // add all stones into the priority queue
        for (int stone : stones) {
            heap.add(stone);
        }
        while (heap.size() > 1) {
            heap.add(heap.remove() - heap.remove());
        }
        return heap.isEmpty() ? 0 : heap.peek();
    }
}
