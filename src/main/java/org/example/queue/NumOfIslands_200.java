package org.example.queue;

import java.util.LinkedList;
import java.util.Queue;

public class NumOfIslands_200 {

    public int numIslands(char[][] grid) {
        int islands = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == '1') {
                    islands++;
                    sink(grid, i, j);
                }
            }
        }
        return islands;
    }

    private void sink(char[][] grid, int i, int j) {
        grid[i][j] = '0';
        int c = grid[0].length;
        int code = i * c + j;
        Queue<Integer> queue = new LinkedList<Integer>();
        queue.offer(code);

        while (!queue.isEmpty()) {
            code = queue.poll();
            i = code / c;
            j = code % c;


            if (i > 0 && grid[i - 1][j] == '1') {
                queue.offer((i - 1) * c + j);
                grid[i - 1][j] = '0';
            }
            if (i< grid.length-1 && grid[i + 1][j] == '1') {
                queue.offer((i + 1) * c + j);
                grid[i + 1][j] = '0';
            }
            if (j >0 && grid[i][j - 1] == '1') {
                queue.offer(i * c + (j - 1));
                grid[i][j - 1] = '0';
            }
            if (j<grid[0].length-1 && grid[i][j + 1] == '1') {
                queue.offer(i * c + (j + 1));
                grid[i][j + 1] = '0';
            }

        }
    }

    public static void main(String[] args) {
        NumOfIslands_200 numOfIslands = new NumOfIslands_200();
        char[][] grid = new char[][]{{'1', '1', '0', '0', '0'}, {'1', '1', '0', '0', '0'}, {'0', '0', '1', '0', '0'}, {'0', '0', '0', '1', '1'}};
        System.out.println(numOfIslands.numIslands(grid));
    }
}
