package org.example.recurse;

public class NumOfIslands_200 {

    public int numIslands(char[][] grid) {
        int islands = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == '1') {
                    sink(grid, i, j);
                    islands++;
                }
            }
        }
        return islands;
    }

    private void sink(char[][] grid, int i, int j) {
        if (i >= 0 && j >= 0 && i < grid.length && j < grid[0].length && grid[i][j] == '1') {
            grid[i][j] = 0;
            sink(grid, i + 1, j);
            sink(grid, i - 1, j);
            sink(grid, i, j + 1);
            sink(grid, i, j - 1);
        }
    }

}
