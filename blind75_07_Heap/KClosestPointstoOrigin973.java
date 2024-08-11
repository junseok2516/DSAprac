import java.util.*;

public class KClosestPointstoOrigin973 {
    public static int[][] kClosest(int[][] points, int k) {
        // answer that I still need time to understand
        if (k == points.length) return points;

        PriorityQueue<int[]> heap = new PriorityQueue<>(k, new Comparator<int[]>() {
            @Override
            public int compare(int[] a, int[] b) {
                return (b[0]*b[0] + b[1]*b[1]) - (a[0]*a[0] + a[1]*a[1]);
            }
        });

        for (int[] point:points) {
            heap.add(point);
            if(heap.size() > k) heap.poll();
        }
        return heap.toArray(new int[0][0]);



//        if (k == points.length) return points;
//
//        Map<Double, int[]> hmap = new HashMap<>();
//        for (int i = 0; i < points.length; i++) {
//            hmap.put(Math.pow(points[i][0], 2) + Math.pow(points[i][1], 2), points[i]);
////            hmap.getOrDefault(Math.pow(points[i][0], 2) + Math.pow(points[i][1], 2), points[i]);
//        }
//
//        PriorityQueue<Double> heap = new PriorityQueue<>();
//        heap.addAll(hmap.keySet());
//
//        int[][] result = new int[k][2];
//        for (int i = 0; i < k; i++) {
//            result[i] = hmap.get(heap.remove());
//        }
//        return result;
    }

    public static void main(String[] args) {
        int[][] points = {{0,1},{1,0}}; int k = 2;
        System.out.println(Arrays.deepToString(kClosest(points, k)));
    }
}
