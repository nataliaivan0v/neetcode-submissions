class Solution {
    public boolean isValidSudoku(char[][] board) {
        for (int i = 0; i < 9; i++) {
            Set<Character> seenRow = new HashSet<>();
            Set<Character> seenCol = new HashSet<>();
            for (int j = 0; j < 9; j++) {
                if (board[i][j] != '.') {
                    if (seenRow.contains(board[i][j])) return false;
                    seenRow.add(board[i][j]);
                }

                if (board[j][i] != '.') {
                    if (seenCol.contains(board[j][i])) return false;
                    seenCol.add(board[j][i]);
                };
            }

            Set<Character> seenSquare = new HashSet<>();
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    int row = (i / 3) * 3 + j;
                    int col = (i % 3) * 3 + k;
                    if (board[row][col] == '.') continue;
                    if (seenSquare.contains(board[row][col])) return false;
                    seenSquare.add(board[row][col]);
                }
            }
        }

        return true;
    }
}
