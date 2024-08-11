public class UniquePathsII63 {
    static int uniquePathsWithObstacles(int[][] obstacleGrid) {
        // using DP2D_Top-Down
        if (obstacleGrid.length == 0 || obstacleGrid[0].length == 0) return 0;
        int[][] cache = new int[obstacleGrid.length][obstacleGrid[0].length];
        return helperFunc(obstacleGrid, 0, 0, cache);
    }

    static int helperFunc(int[][] matrix, int r, int c, int[][] cache) {
        if (r == matrix.length || c == matrix[0].length) return 0;
        if (matrix[r][c] == 1) return 0;
        if (cache[r][c] != 0) return cache[r][c];
        if (r == matrix.length - 1 && c == matrix[0].length - 1) return 1;

        cache[r][c] = helperFunc(matrix,r+1,c,cache) + helperFunc(matrix,r,c+1,cache);
        return cache[r][c];
    }

    public static void main(String[] args) {
        int[][] obstacleGrid = {{0,0,0},{0,1,0},{0,0,0}};
        int[][] obstacleGrid01 = {{0,1},{0,0}};
        System.out.println(uniquePathsWithObstacles(obstacleGrid));
        System.out.println(uniquePathsWithObstacles(obstacleGrid01));
    }
}
