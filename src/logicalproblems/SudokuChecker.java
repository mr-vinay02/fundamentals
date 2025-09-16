package logicalproblems;

import java.util.HashSet;

public class SudokuChecker {

    static boolean isValidSudoku(char[][] board) {
        HashSet<Character>[] rows = new HashSet[9];
        HashSet<Character>[] column = new HashSet[9];
        HashSet<Character>[] boxes = new HashSet[9];


        for (int i = 0; i < 9; i++) {
            rows[i] = new HashSet<Character>();
            column[i] = new HashSet<Character>();
            boxes[i] = new HashSet<Character>();
        }
        for(int i = 0;i<9;i++)
        {
            for (int j = 0; j < 9; j++) {
                char c = board[i][j];

                if(c == '.')continue;

                if(rows[i].contains(c))return false;
                rows[i].add(c);

                if(column[j].contains(c))return false;
                column[j].add(c);

                int boxIndex = (i / 3) * 3 + (j / 3);

                if(boxes[boxIndex].contains(c))return false;
                boxes[boxIndex].add(c);

            }
        }

        return true;
    }

    public static void main(String[] args) {
        char[][] board = {
                {'5','3','.','.','7','.','.','.','.'},
                {'6','.','.','1','9','5','.','.','.'},
                {'.','9','8','.','.','.','.','6','.'},
                {'8','.','.','.','6','.','.','.','3'},
                {'4','.','.','8','.','3','.','.','1'},
                {'7','.','.','.','2','.','.','.','6'},
                {'.','6','.','.','.','.','2','8','.'},
                {'.','.','.','4','1','9','.','.','5'},
                {'.','.','.','.','8','.','.','7','9'}
        };

        boolean valid = isValidSudoku(board);
        System.out.println(valid ? "It is a valid Sudoku..... ": "It is not a valid Sudoku");
    }


}
