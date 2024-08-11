public class MaxAreaofIsland695 {
    int C;
    int R;
    int[][] visit;
    public int maxAreaOfIsland(int[][] grid) {
        visit = grid;
        R = grid.length;
        if (R == 0) return 0;
        C = grid[0].length;
        int maxSize = 0;

        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                if (grid[i][j] == 1) {
                    maxSize = Math.max(maxSize, dfs(i,j));
                }
            }
        }
        return maxSize;
    }

    int dfs(int r, int c) {
        if (r < 0 || c < 0 || r == R || c == C || visit[r][c] == 0) {
            return 0;
        }
        visit[r][c] = 0;
        int count = 1;
        count += dfs(r+1, c);
        count += dfs(r-1, c);
        count += dfs(r, c+1);
        count += dfs(r, c-1);

        return count;
    }
}

