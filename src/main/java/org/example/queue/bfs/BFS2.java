package org.example.queue.bfs;

import org.example.stack.dfs.Node;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class BFS2 {
    /*
    find the shortest path in a graph with a cycle
     */
    public int bfs(Node root, Node target) {
        int level = 0;
        Queue<Node> queue = new LinkedList<>();
        Set<Integer> visited = new HashSet<>();

        queue.offer(root);

        while (!queue.isEmpty()){
            int size = queue.size();

            for (int i =0; i<size; i++){
                Node cur = queue.remove();
                if (!visited.add(cur.val)){
                    continue;
                }
                if(target.val==cur.val){
                    return level;
                }
                for (Node node : cur.neighbors){
                    if (!visited.contains(node.val)){
                        queue.offer(node);
                    }
                }
            }
            level++;
        }
        return -1;
    }
}
