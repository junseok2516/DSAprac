package PrefixSums;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class RangeSumQuery2D_Immutable304 {
    int[][] prefixSum;
    public RangeSumQuery2D_Immutable304(int[][] matrix) {
        prefixSum = new int[matrix.length+1][matrix[0].length+1];
        for (int i = 0; i < matrix.length; i++) {
            int total = 0;
            for (int j = 0; j < matrix[0].length; j++) {
                total += matrix[i][j];
                prefixSum[i+1][j+1] = prefixSum[i][j+1] + total;
            }
        }
        System.out.println(Arrays.deepToString(prefixSum));
    }

    public int sumRegion(int row1, int col1, int row2, int col2) {
        return prefixSum[row2+1][col2+1] - prefixSum[row1][col2+1] - prefixSum[row2+1][col1] + prefixSum[row1][col1];
    }

    public static void main(String[] args) {
        RangeSumQuery2D_Immutable304 test = new RangeSumQuery2D_Immutable304(new int[][]{{3,0,1,4,2},{5,6,3,2,1},{1,2,0,1,5},{4,1,0,1,7},{1,0,3,0,5}});
        System.out.println(test.sumRegion(1,1,2,2));
    }
}
