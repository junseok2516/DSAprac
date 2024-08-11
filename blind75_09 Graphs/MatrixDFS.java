public class MatrixDFS {
    public static int dfs(int[][] grid, int r, int c, int[][] visit) {
        int R = grid.length; int C = grid[0].length;
        if ((Math.min(r,c) < 0 ) || (r == R || c == C) || (visit[r][c] == 1) || (grid[r][c] == 1)) {
            return 0;
        } else if (r == R - 1 && c == C - 1) {
            return 1;
        }
        visit[r][c] = 1;
        int count = 0;
        count += dfs(grid,r-1,c,visit);
        count += dfs(grid,r+1,c,visit);
        count += dfs(grid,r,c-1,visit);
        count += dfs(grid,r,c+1,visit);
        visit[r][c] = 0;
        return count;
    }
}
