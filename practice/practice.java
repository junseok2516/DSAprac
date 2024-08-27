public class practice {
    static int uniquePath(int[][] obstacleGrid) {
//        return bruteForce(0, 0, obstacleGrid.length, obstacleGrid[0].length, obstacleGrid);
        return topDown(0, 0, obstacleGrid.length, obstacleGrid[0].length, obstacleGrid, new int[obstacleGrid.length][obstacleGrid[0].length]);
    }

    static int bruteForce(int r, int c, int Rows, int Cols, int[][] grid) {
        if (r == Rows || c == Cols || grid[r][c] == 1) return 0;
        if (r == Rows - 1 && c == Cols - 1) return 1;
        return bruteForce(r+1,c,Rows,Cols,grid)+bruteForce(r,c+1,Rows,Cols,grid);
    }

    static int topDown(int r, int c, int Rows, int Cols, int[][] grid, int[][] dp) {
        if (r == Rows || c == Cols || grid[r][c] == 1) return 0;
        if (dp[r][c] > 0) return dp[r][c];
        if (r == Rows - 1 && c == Cols - 1) return 1;

        dp[r][c] = topDown(r+1,c,Rows,Cols,grid,dp) + topDown(r,c+1,Rows,Cols,grid,dp);
        return dp[r][c];
    }

    public static void main(String[] args) {
        int[][] obstacleGrid = {
//                {0,0,0},
//                {0,1,0},
//                {0,0,0}

                {0,1},
                {0,0}

        };
        System.out.println(uniquePath(obstacleGrid));
    }
}