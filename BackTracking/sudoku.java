public class sudoku {

    public boolean isSafe(char[][] board, int row, int col, int num) {
        // for rows and columns
        for (int i = 0; i < board.length; i++) {
            if (board[row][i] == (char) (num + '0'))
                return false;
            if (board[row][i] == (char) (num + '0'))
                return false;
        }

        // for grid
        int r = 3 * (row / 3);
        int c = 3 * (col / 3);
        for (int i = 0; i < r + 3; i++) {
            for (int j = 0; j < c + 3; j++) {
                if (board[i][j] == (char) (num + '0'))
                    return false;
            }
        }
        return true;
    }

    public boolean helper(char[][] board, int row, int col) {
        if (row == board.length) {
            return true;
        }
        int newRow = 0;
        int newCol = 0;
        if (col != board.length - 1) {
            newCol += 1;
        } else {
            newRow += 1;
            newCol = 0;
        }
        if (board[row][col] != '.') {
            if (helper(board, newRow, newCol))
                return true;
        } else {
            for (int i = 0; i <= 9; i++) {
                if (isSafe(board, row, col, i)) {
                    board[row][col] = (char) (i + '0');
                    if (helper(board, newRow, newCol)) {
                        return true;
                    } else {
                        board[row][col] = '.';
                    }
                }
            }
        }
        return false;
    }

    public void solveSudoku(char[][] board) {
        helper(board, 0, 0);
    }

    char[][] board  ={{'5','3','4','6','7','8','9','1','2'},{'6','7','2','1','9','5','3','4','8'},{'1','9','8','3','4','2','5','6','7'},{'8','5','9','7','6','1','4','2','3'},{'4','2','6','8','5','3','7','9','1'},{'7','1','3','9','2','4','8','5','6'},{'9','6','1','5','3','7','2','8','4'},{'2','8','7','4','1','9','6','3','5'},{'3','4','5','2','8','6','1','7','9'}};

}
