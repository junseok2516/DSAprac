import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Heap {
    List<Integer> heap = new LinkedList<>();

    public void push(int val) {
        heap.add(val);
        int i = heap.size() - 1;
        while (heap.get(i) < heap.get(i/2)) {
            int temp = heap.get(i / 2);
            heap.set(i / 2, heap.get(i));
            heap.set(i, temp);
            i = i / 2;
        }
    }

    public int pop() {
        if (heap.size() <= 1) return 0; // since no elements in the heap
        if (heap.size() == 2) return heap.remove(1); // only one element in the heap
        //record the min
        int result = heap.get(1);
        //swap the first and the last element
        heap.set(1, heap.remove(heap.size() - 1));
        int i = 1;
        //percolate down
        while (i * 2 < heap.size() - 1) {
            if (((i * 2 + 1) < heap.size() - 1) && (heap.get(i*2+1) < heap.get(i*2)) && (heap.get(i*2+1) < heap.get(i))) {
                int temp = heap.get(i);
                heap.set(i, heap.get(i*2+1));
                heap.set(i*2+1, temp);
                i = i*2+1;
            } else if (heap.get(i) > heap.get(i*2)) {
                int temp = heap.get(i);
                heap.set(i, heap.get(i*2));
                heap.set(i*2, temp);
                i = i*2;
            } else {
                break;
            }
        }
        return result;
    }

    public void heapify(ArrayList<Integer> arr) {
        arr.add(arr.getFirst());
        heap = arr;
        int cur = (arr.size() - 1) / 2;
        while (cur > 0) {
            int i = cur;
            while (i * 2 > heap.size()) {
                if (((i*2+1) < heap.size()) && (heap.get(i*2+1) < heap.get(i*2)) && (heap.get(i) > heap.get(i*2+1))) {
                    int temp = heap.get(i);
                    heap.set(i, heap.get(i*2+1));
                    heap.set(i*2+1, temp);
                    i = i * 2 + 1;
                } else if (heap.get(i*2) < heap.get(i)) {
                    int temp = heap.get(i);
                    heap.set(i, heap.get(i*2));
                    heap.set(i*2, temp);
                    i = i * 2;
                } else {
                    break;
                }
            }
            i -= 1;
        }
    }
}
