import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ValidSudoku36 {
    public static boolean isValidSudoku(char[][] board) {
        Set seen = new HashSet();
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] != '.') {
                    // 4 in row 1 then (4)1
                    // 4 in col 1 then 1(4)
                    // 4 in 3x3 of 1 index then (4)01
                    String temp = "(" + board[i][j] + ")";
                    if (!seen.add(temp + i) || !seen.add(j + temp) || !seen.add(temp + i/3 + j/3)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
    }

}
