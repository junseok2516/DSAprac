public class NumberofIslands200 {
    static int R;
    static int C;
    static char[][] visit;
    public static int numIslands(char[][] grid) {
       R = grid.length;
       if (R < 0) return 0;
       C = grid[0].length;
       visit = grid;
       int count = 0;
       for (int i = 0; i < R; i++) {
           for (int j = 0; j < C; j++) {
               if (grid[i][j] == '1') {
                   dfs(i,j);
                   count++;
               }
           }
       }
       return count;
    }

    static void dfs(int r, int c) {
        if (r < 0 || c < 0 || r == R || c == C || visit[r][c] == '0') {
            return;
        }
        visit[r][c] = '0';
        dfs(r+1,c);
        dfs(r-1,c);
        dfs(r,c+1);
        dfs(r,c-1);
    }

    public static void main(String[] args) {
        char[][] grid = {
                {'1','1','1','1','0'},
                {'1','1','0','1','0'},
                {'1','1','0','0','0'},
                {'0','0','0','0','0'}
                        };
        System.out.println(numIslands(grid));
    }
}
