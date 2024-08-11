import java.util.ArrayDeque;
import java.util.Deque;

public class MatrixBFS {
    int bfs(int[][] grid) {
        int R = grid.length; int C = grid[0].length;
        int[][] visit = grid;
        Deque<int[]> queue = new ArrayDeque<>();

        // Row and Col format
        queue.add(new int[2]);
        // starting from (0,0) so be visited
        visit[0][0] = 1;

        // initialize the length
        int length = 0;
        while (!queue.isEmpty()) {
            int queueLength = queue.size();
            for (int i = 0; i < queueLength; i++) {
                int[] coord = queue.poll();
                int coordRow = coord[0]; int coordCol = coord[1];
                if (coordRow == R - 1 && coordCol == C -1) return length;

                // visit neighbours of each coord
                int[][] neighbors = {{coordRow-1, coordCol}, {coordRow+1, coordCol},
                                    {coordRow, coordCol-1}, {coordRow, coordCol+1}};
                for (int j = 0; j < neighbors.length; j++) {
                    int newR = neighbors[j][0]; int newC = neighbors[j][1];
                    if (newR < 0 || newC < 0 || newR == R || newC == C || visit[newR][newC] == 1 || grid[newR][newC] == 1) {
                        continue;
                    }
                    visit[newR][newC] = 1;
                    queue.add(neighbors[j]);
                }
            }
            length++;
        }
        return length;
    }
}
