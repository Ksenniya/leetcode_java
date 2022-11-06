package org.example.queue.bfs;

import java.util.*;

public class OpenTheLockBfs {

    private final String start = "0000";

    public int openLock(String[] deadends, String target) {
        if (target == null || target.length() == 0) {
            return -1;
        }
        int level = 0;
        Queue<String> queue = new LinkedList<>();
        Set<String> visited = new HashSet<>(Arrays.asList(deadends));
        queue.offer(start);
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                String cur = queue.remove();
                if (!visited.add(cur)){
                    continue;
                }
                if (cur.equals(target)){
                    return level;
                }
                for (String lock : getLocks(cur)){
                    if (!visited.contains(lock)){
                        queue.offer(lock);
                    }
                }
            }
            level++;
        }
        return -1;
    }

    private List<String> getLocks(String lock){
        List<String> locks = new ArrayList<>();

        char[] arr = lock.toCharArray();

        for (int i = 0; i < arr.length; i++){
            char c = arr[i];
            arr[i] = c == '9' ? '0' : (char) (c+((char)1));
            arr[i] = c == '0' ? '9' : (char) (c-((char)1));
            locks.add(String.valueOf(arr));
            arr[i] = c;
        }
        return locks;

    }
}
