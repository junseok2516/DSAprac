package Matrix;

import java.util.HashSet;
import java.util.Set;

public class ValidSudoku36 {
    static boolean isValidSudoku(char[][] board) {
        // checking each of rows, cols and sub-boxes (fixed size 9 by 9)
        // if the same number appears in more than two, return false
        // * sub-boxes and each 3 indices of row and col, [0-2][0-2],[3-5][3-5],[6-8][6-8]
        // each box can be recognized as [0][0], [1][1], [2][2] by dividing / 3
        // SET will be the one to distinguish the unique element in each row,col and box
        // add of HashSet returns true iff there is no duplicate element in it
        // 13ms 25.91% O(n^2)
        Set<String> set = new HashSet<>();
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] != '.') {
                    if (!set.add("row[" + i + "]_" + board[i][j]) ||
                            !set.add("col[" + j + "]_" + board[i][j]) ||
                            !set.add("box[" + i/3 + "][" + j/3 + "]_" + board[i][j])) {
                        return false;
                    }
                }
            }
        }
        return true;
    }


//    static boolean isValidSudoku(String[][] board) {
//        // checking each of rows, cols and sub-boxes (fixed size 9 by 9)
//        // if the same number appears in more than two, return false
//        // * sub-boxes and each 3 indices of row and col, [0-2][0-2],[3-5][3-5],[6-8][6-8]
//        // each box can be recognized as [0][0], [1][1], [2][2] by dividing / 3
//        // SET will be the one to distinguish the unique element in each row,col and box
//        // add of HashSet returns true iff there is no duplicate element in it
//        Set<String> set = new HashSet<>();
//        for (int i = 0; i < 9; i++) {
//            for (int j = 0; j < 9; j++) {
//                System.out.println(board[i][j]);
//                if (!board[i][j].equals(".")) {
//                    if (!set.add("row[" + i + "]_" + board[i][j]) ||
//                            !set.add("col[" + j + "]_" + board[i][j]) ||
//                            !set.add("box[" + i/3 + "][" + j/3 + "]_" + board[i][j])) {
//                        return false;
//                    }
//                }
//            }
//        }
//        return true;
//    }

    public static void main(String[] args) {
        String[][] board =
                        {{"5","3",".",".","7",".",".",".","."}
                        ,{"6",".",".","1","9","5",".",".","."}
                        ,{".","9","8",".",".",".",".","6","."}
                        ,{"8",".",".",".","6",".",".",".","3"}
                        ,{"4",".",".","8",".","3",".",".","1"}
                        ,{"7",".",".",".","2",".",".",".","6"}
                        ,{".","6",".",".",".",".","2","8","."}
                        ,{".",".",".","4","1","9",".",".","5"}
                        ,{".",".",".",".","8",".",".","7","9"}};
//        System.out.println(isValidSudoku(board));
    }
}
