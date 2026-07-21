class Solution {
    public int numIslands(char[][] grid) {
        int count = 0;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == '1') {
                    grid[i][j] = '0';
                    visitIsland(grid, i, j);
                    count++;
                }
            }
        }

        return count;
    }

    private void visitIsland(char[][] grid, int i, int j) {
        int[] dRow = {-1, 1, 0, 0};
        int[] dCol = {0, 0, -1, 1};

        for (int k = 0; k < 4; k++) {
            int newRow = i + dRow[k];
            int newCol = j + dCol[k];

            if (newRow >= 0 && newRow < grid.length && newCol >= 0 && newCol < grid[0].length) {
                if (grid[newRow][newCol] == '1') {
                    grid[newRow][newCol] = '0';
                    visitIsland(grid, newRow, newCol);
                }
            }
        }
    }
}
