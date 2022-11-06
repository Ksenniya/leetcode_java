package org.example.stack.dfs;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CloneGraphTest {

    @Test
    void cloneGraph() {
        CloneGraph cg = new CloneGraph();
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        n2.neighbors.add(new Node(4));
        n2.neighbors.add(new Node(5));
        Node n3 = new Node(3);
        n3.neighbors.add(new Node(6));
        n3.neighbors.add(new Node(7));
        n1.neighbors.add(n2);
        n1.neighbors.add(n3);
        Node newNode = cg.cloneGraph(n1);
        Assertions.assertEquals(1, newNode.val);
        Assertions.assertEquals(2, newNode.neighbors.get(0).val);
        Assertions.assertEquals(3, newNode.neighbors.get(1).val);

    }
}