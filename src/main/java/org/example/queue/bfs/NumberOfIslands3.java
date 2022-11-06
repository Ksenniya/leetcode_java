package org.example.queue.bfs;

import java.util.LinkedList;
import java.util.Queue;

public class NumberOfIslands3 {

    public int numIslands(char[][] grid) {
        int numofIslands = 0;
        int n = grid.length;

        for (int i0 = 0; i0 < grid.length; i0++) {
            int m = grid[0].length;
            for (int j0 = 0; j0 < m; j0++) {
                if (grid[i0][j0] == '1') {
                    Queue<Integer> queue = new LinkedList<>();
                    numofIslands++;
                    int code = i0 * m + j0;
                    queue.offer(code);
                    while (!queue.isEmpty()) {
                        code = queue.poll();
                        int i = code / m;
                        int j = code % m;
                        if (i > 0 && grid[i - 1][j] == '1')    //search upward and mark adjacent '1's as '0'.
                        {
                            queue.offer((i - 1) * m + j);
                            grid[i - 1][j] = '0';
                        }
                        if (i < n - 1 && grid[i + 1][j] == '1')  //down
                        {
                            queue.offer((i + 1) * m + j);
                            grid[i + 1][j] = '0';
                        }
                        if (j > 0 && grid[i][j - 1] == '1')  //left
                        {
                            queue.offer(i * m + j - 1);
                            grid[i][j - 1] = '0';
                        }
                        if (j < m - 1 && grid[i][j + 1] == '1')  //right
                        {
                            queue.offer(i * m + j + 1);
                            grid[i][j + 1] = '0';
                        }
                    }
                }
            }
        }

        return numofIslands;
    }
}
