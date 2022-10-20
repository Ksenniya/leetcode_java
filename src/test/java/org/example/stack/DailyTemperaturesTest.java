package org.example.stack;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

class DailyTemperaturesTest {

    @Test
    void dailyTemperatures() {

        DailyTemperatures dailyTemperatures = new DailyTemperatures();
        Assertions.assertTrue(Arrays.equals(new int[]{1, 1, 4, 2, 1, 1, 0, 0},
                dailyTemperatures.dailyTemperatures(new int[]{73, 74, 75, 71, 69, 72, 76, 73})));
    }
}