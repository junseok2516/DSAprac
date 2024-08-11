public class Searcha2DMatrix74 {
    public static boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix[0].length; // row len (left to right)
        int m = matrix.length; // col len (top to bottom)

        int top = 0; int bot = m - 1;
        int line = 0;
        while (top <= bot) { // find a row containing target
            int mid = (top + bot) / 2;
            if (target > matrix[mid][n - 1]) {
                top = mid + 1;
            } else if (target < matrix[mid][0]) {
                bot = mid - 1;
            } else {
                line = mid;
                break;
            }
        }

        int l = 0; int r = n - 1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (target > matrix[line][mid]) l = mid + 1;
            else if (target < matrix[line][mid]) r = mid - 1;
            else return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] matrix = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        int target = 3;
        System.out.println(searchMatrix(matrix, target));
    }
}
