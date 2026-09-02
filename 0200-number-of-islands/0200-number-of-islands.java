class Solution {

    public int numIslands(char[][] grid) {

        int count = 0;

        for (int i = 0; i < grid.length; i++) {

            for (int j = 0; j < grid[0].length; j++) {

                if (grid[i][j] == '1') {

                    count++;

                    dfs(grid, i, j);
                }
            }
        }

        return count;
    }

    private void dfs(char[][] grid, int i, int j) {

        // Outside the grid
        if (i < 0 || i >= grid.length ||
            j < 0 || j >= grid[0].length) {
            return;
        }

        // Water
        if (grid[i][j] == '0') {
            return;
        }

        // Mark as visited
        grid[i][j] = '0';

        // Go up
        dfs(grid, i - 1, j);

        // Go down
        dfs(grid, i + 1, j);

        // Go left
        dfs(grid, i, j - 1);

        // Go right
        dfs(grid, i, j + 1);
    }
}