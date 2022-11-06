package org.example.queue.bfs;

import org.example.stack.dfs.Node;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BFS1 {
    /*
    return length of the shortest path between the root and the target node
     */
    public int bfs(Node root, Node target) {
        Queue<Node> queue = new LinkedList<>();
        int level = 0;
        queue.offer(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                Node cur = queue.remove();
                if (cur.val == target.val){
                    return level;
                }
                for (Node node : cur.neighbors) {
                    queue.offer(node);
                }
            }
            level++;
        }
        return -1;
    }

}
