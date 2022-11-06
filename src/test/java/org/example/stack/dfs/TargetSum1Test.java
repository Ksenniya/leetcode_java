package org.example.stack.dfs;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TargetSum1Test {

    @Test
    void findTargetSumWays() {

        TargetSum1 targetSum1 = new TargetSum1();
        int count = targetSum1.findTargetSumWays(new int[]{1,1,1,1,1}, 3);
        Assertions.assertEquals(5, count);

    }
}