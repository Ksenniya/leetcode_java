package org.example.queue;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PerfectSquaresTest {

    @Test
    void numSquares() {
        PerfectSquares perfectSquares = new PerfectSquares();
        Assertions.assertEquals(2, perfectSquares.numSquares(13));
    }
}