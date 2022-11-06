package org.example.queue.bfs;

import javafx.util.Pair;

import java.util.LinkedList;
import java.util.Queue;

public class NumberOfIslands2 {

    public int numIslands(char[][] grid) {
        int numofIslands = 0;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == '1') {
                    Queue<Pair<Integer, Integer>> queue = new LinkedList<>();
                    queue.offer(new Pair<>(i, j));
                    numofIslands++;
                    while (!queue.isEmpty()) {
                        Pair<Integer, Integer> cur = queue.remove();
                        int x = cur.getKey();
                        int y = cur.getValue();

                        if (y + 1 < grid[0].length && grid[x][y + 1] == '1') {
                            queue.offer(new Pair<>(x, y + 1));
                            grid[x][y + 1]='0';
                        }
                        if (x + 1 < grid.length && grid[x + 1][y] == '1') {
                            queue.offer(new Pair<>(x + 1, y));
                            grid[x + 1][y] = '0';
                        }
                        if (y - 1 >= 0 && grid[x][y - 1] == '1') {
                            queue.offer(new Pair<>(x, y - 1));
                            grid[x][y - 1] = '0';
                        }
                        if (x - 1 >= 0 && grid[x - 1][y] == '1') {
                            queue.offer(new Pair<>(x - 1, y));
                            grid[x - 1][y] = '0';
                        }

                    }
                }
            }
        }

        return numofIslands;
    }
}
