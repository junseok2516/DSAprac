package Matrix;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix54 {
    static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list = new ArrayList<>();
        int rows = matrix.length, cols = matrix[0].length;
        int left = 0, down = 0, right = cols - 1, up = rows - 1;

        while (left <= right && down <= up) {
            // to the right
            for (int i = left; i <= right; i++) {
                list.add(matrix[down][i]);
            }
            down++;
            // to the up
            for (int i = down; i <= up; i++) {
                list.add(matrix[i][right]);
            }
            right--;
            // to the left
            if (down <= up) {
                for (int i = right; i >= left; i--) {
                    list.add(matrix[up][i]);
                }
                up--;
            }
            // to the up
            if (left <= right) {
                for (int i = up; i >= down; i--) {
                    list.add(matrix[i][left]);
                }
                left++;
            }
        }
        return list;
    }

    public static void main(String[] args) {
        int[][] matrix = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        System.out.println(spiralOrder(matrix));
    }
}
