package org.example.queue;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class NumOfIslands_200Test {

    @Test
    public void numIslandsTest() {
        NumOfIslands_200 numOfIslands = new NumOfIslands_200();
        char[][] grid = new char[][]{{'1','1','0','0','0'}, {'1','1','0','0','0'}, {'0','0','1','0','0'}, {'0','0','0','1','1'}};
        Assertions.assertEquals(3, numOfIslands.numIslands(grid));
    }
}