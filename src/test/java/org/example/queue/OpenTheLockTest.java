package org.example.queue;

import org.example.queue.bfs.OpenTheLockBfs;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class OpenTheLockTest {

    @Test
    void openLock() {
        //deadends = ["0201","0101","0102","1212","2002"], target = "0202"
        OpenTheLock openTheLock = new OpenTheLock();
        Assertions.assertEquals(6, openTheLock.openLock(new String[]{"0201", "0101", "0102", "1212", "2002"}, "0202"));
    }

    @Test
    void openLock1() {
        //deadends = ["0201","0101","0102","1212","2002"], target = "0202"
        OpenTheLockBfs openTheLock = new OpenTheLockBfs();
        Assertions.assertEquals(6, openTheLock.openLock(new String[]{"0201", "0101", "0102", "1212", "2002"}, "0202"));
    }
}