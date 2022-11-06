package org.example.queue;

import org.example.queue.bfs.NumberOfIslands;
import org.example.queue.bfs.NumberOfIslands2;
import org.example.queue.bfs.NumberOfIslands3;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class NumOfIslands_200Test {

    @Test
    public void numIslandsTest() {
        NumOfIslands_200 numOfIslands = new NumOfIslands_200();
        char[][] grid = new char[][]{{'1','1','0','0','0'}, {'1','1','0','0','0'}, {'0','0','1','0','0'}, {'0','0','0','1','1'}};
        Assertions.assertEquals(3, numOfIslands.numIslands(grid));
    }

    @Test
    public void numIslandsTestBfs() {
        NumberOfIslands numOfIslands = new NumberOfIslands();
        char[][] grid = new char[][]{{'1','1','0','0','0'}, {'1','1','0','0','0'}, {'0','0','1','0','0'}, {'0','0','0','1','1'}};
        Assertions.assertEquals(3, numOfIslands.numIslands(grid));
    }

    @Test
    public void numIslandsTestBfs2() {
        NumberOfIslands2 numOfIslands = new NumberOfIslands2();
        char[][] grid = new char[][]{{'1','1','0','0','0'}, {'1','1','0','0','0'}, {'0','0','1','0','0'}, {'0','0','0','1','1'}};
        Assertions.assertEquals(3, numOfIslands.numIslands(grid));
    }

    @Test
    public void numIslandsTestBfs3() {
        NumberOfIslands3 numOfIslands = new NumberOfIslands3();
        char[][] grid = new char[][]{{'1','1','0','0','0'}, {'1','1','0','0','0'}, {'0','0','1','0','0'}, {'0','0','0','1','1'}};
        Assertions.assertEquals(3, numOfIslands.numIslands(grid));
    }
}