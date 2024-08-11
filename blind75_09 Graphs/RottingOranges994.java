import java.util.ArrayDeque;
import java.util.Deque;

public class RottingOranges994 {
    public static int orangesRotting(int[][] grid) {
        int R = grid.length; int C = grid[0].length;
        int[][] visit = grid; int countFreschOrange = 0;
        Deque<int[]> queue = new ArrayDeque<>();
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (visit[i][j] == 2) {
                    queue.add(new int[]{i,j});
                }
                if (visit[i][j] == 1) {
                    countFreschOrange++;
                }
            }
        }

        if (countFreschOrange == 0) return -1;
        if (queue.isEmpty()) return -1;

        int turn = -1;
        while (!queue.isEmpty()) {
            int queueLength = queue.size();
            for (int i = 0; i < queueLength; i++) {
                int[] coord = queue.poll();
                int newR = coord[0]; int newC = coord[1];
                int[][] neighbors = {{newR+1,newC}, {newR-1,newC},
                                    {newR,newC+1}, {newR,newC-1}};
                for (int j = 0; j < neighbors.length; j++) {
                    int r = neighbors[j][0]; int c = neighbors[j][1];
                    if (r >= 0 && c >= 0 && r < R && c < C && visit[r][c] == 1) {
                        visit[r][c] = 2;
                        countFreschOrange--;
                        queue.add(neighbors[j]);
                    }

                }
            }
            turn++;
        }
        if (countFreschOrange == 0) return turn;
        return -1;
    }

    public static void main(String[] args) {
        int[][] grid = {{2,1,1},{0,1,1},{1,0,1}};
        System.out.println(orangesRotting(grid));
    }
}
