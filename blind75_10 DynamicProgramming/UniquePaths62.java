public class UniquePaths62 {
    static int uniquePaths(int m, int n) {
        if (m == 0 || n == 0) return 0;
        int[][] cache = new int[m][n];
        return helperFunc(m,n,0, 0, cache);
    }

    // Using DP_Top-Down
    static int helperFunc(int rows, int cols, int r, int c, int[][] cache) {
        if (r == rows || c == cols) return 0;
        if (cache[r][c] != 0) return cache[r][c];
        if (r == rows - 1 && c == cols - 1) return 1;

        cache[r][c] = helperFunc(rows, cols, r + 1, c, cache) + helperFunc(rows, cols, r, c + 1, cache);
        return cache[r][c];
    }

    public static void main(String[] args) {
        System.out.println(uniquePaths(3,2));
    }
}
