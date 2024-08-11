public class DP2D {
    // brute force
    static int bf(int[][] matrix, int r, int c) {
        if (matrix.length == 0 || matrix[0].length == 0 || r == matrix.length || c == matrix[0].length) return 0;
        if (r == matrix.length - 1 && c == matrix[0].length - 1) return 1;
        int count = 0;
        for (int i = 0; i < matrix.length; i++) {
            count = bf(matrix, r + 1, c) + bf(matrix, r, c + 1);
        }
        return count;
    }

    // Top-down it takes more space than bottom-up
    static int td(int[][] matrix, int r, int c, int[][] cache) {
        if (matrix.length == 0 || matrix[0].length == 0 || r == matrix.length || c == matrix[0].length) return 0;
        if (cache[r][c] != 0) return cache[r][c];
        if (r == matrix.length - 1 && c == matrix[0].length - 1) return 1;

        cache[r][c] = td(matrix,r+1,c,cache) + td(matrix,r,c+1,cache);

        return cache[r][c];
    }

    // bottom-up save space
    static int bu(int[][] matrix) {
        int[] prevR = new int[matrix.length];
        for (int i = matrix.length - 1; i >= 0; i--) {
            int[] currR = new int[matrix.length];
            currR[matrix[0].length - 1] = 1;
            for (int j = matrix[0].length - 2; j >= 0; j--) {
                currR[j] = prevR[j] + currR[j + 1];
            }
            prevR = currR;
        }
        return prevR[0];
    }

    public static void main(String[] args) {
        int[][] matrix = new int[4][4];
        int[][] cache = new int[matrix.length][matrix[0].length];
        System.out.println(bf(matrix, 0, 0));
        System.out.println(td(matrix, 0, 0, cache));
        System.out.println(bu(matrix));
    }
}
