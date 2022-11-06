package org.example.queue.bfs;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class PerfectSquaresBfs {
    /*
    13
    = 4 + 9
     */
    public int numSquares(int n) {

        int level = 0;
        Queue<Integer> queue = new LinkedList<>();
        Set<Integer> set = new HashSet<>();
        queue.offer(n);
        while (!queue.isEmpty()) {
            level++;
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                int cur = queue.remove();
                if (!set.add(cur)) {
                    continue;
                }
                for (int j = 0; j <= Math.sqrt(n); j++) {

                    if (cur - j*j == 0){
                        return level;
                    }
                    queue.offer(cur - j*j);
                }
            }
        }
        return level;
    }
}
