package org.example.stack;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinStackTest {

    @Test
    public void numIslands() {
        MinStack minStack = new MinStack();
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);
        Assertions.assertEquals(-3, minStack.getMin()); // return -3
        minStack.pop();
        Assertions.assertEquals(0, minStack.top());    // return 0
        Assertions.assertEquals(-2,minStack.getMin()); // return -2
    }

}