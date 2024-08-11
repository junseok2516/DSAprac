import java.util.ArrayDeque;
import java.util.Deque;
import java.util.PriorityQueue;

public class ShortestPathinBinaryMatrix1091 {
    public static int shortestPathBinaryMatrix(int[][] grid) {
        if (grid[0][0] == 1) return -1;

        int R = grid.length; int C = grid[0].length;
        int[][] visit = grid;
        Deque<int[]> queue = new ArrayDeque<>();
        queue.add(new int[2]);
        visit[0][0] = 1;

        int length = 0;
        while(!queue.isEmpty()) {
            int queueLength = queue.size();
            length++;
            for (int i = 0; i < queueLength; i++) {
                int[] coord = queue.poll();
                int newR = coord[0]; int newC = coord[1];
                if (newR == R - 1 && newC == C - 1) return length;
                int[][] neighbors = {
                        {newR-1, newC}, {newR+1, newC},
                        {newR, newC-1}, {newR, newC+1},
                        {newR-1, newC-1}, {newR+1, newC+1},
                        {newR-1, newC+1}, {newR+1, newC-1},
                };
                for (int j = 0; j < neighbors.length; j++) {
                    int r = neighbors[j][0]; int c = neighbors[j][1];
                    if (r < 0 || c < 0 || r >= R || c >= C || visit[r][c] == 1 || grid[r][c] == 1) {
                        continue;
                    }
                    visit[r][c] = 1;
                    queue.add(neighbors[j]);
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[][] grid = {{0,1},{1,0}};
//                {{0,0,0},{1,1,0},{1,1,0}};
        System.out.println(shortestPathBinaryMatrix(grid));
    }
}
