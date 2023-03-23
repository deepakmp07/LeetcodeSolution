class Solution {
    public static boolean isSafe(String[][] board, int row, int col, int n) {
        for (int i = 0; i < col; i++) {
            if (board[row][i].equals("Q")) {
                return false;
            }
        }

        for (int i = row, j = col; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j].equals("Q")) {
                return false;
            }
        }

        for (int i = row, j = col; i < n && j >= 0; i++, j--) {
            if (board[i][j].equals("Q")) {
                return false;
            }
        }

        return true;
    }

    public static void solveNQueens(String[][] board, int col, List<List<String>> result) {
        int n = board.length;

        if (col == n) {
            List<String> solution = new ArrayList<>();
            for (String[] row : board) {
                StringBuilder sb = new StringBuilder();
                for (String cell : row) {
                    sb.append(cell);
                }
                solution.add(sb.toString());
            }
            result.add(solution);
            return;
        }

        for (int row = 0; row < n; row++) {
            if (isSafe(board, row, col, n)) {
                board[row][col] = "Q";
                solveNQueens(board, col + 1, result);
                board[row][col] = ".";
            }
        }
    }
    public int totalNQueens(int n) {
        String[][] board = new String[n][n];
        for (String[] row : board) {
            java.util.Arrays.fill(row, ".");
        }
        List<List<String>> result = new ArrayList<>();
        solveNQueens(board, 0, result);
        System.out.println(result);
        return result.size();
    }
}