package org.example.queue;

import java.util.LinkedList;
import java.util.List;

public class MyQueueWithLL {

    private List<Integer> data = new LinkedList<>();

    public boolean enqueue(int x) {
        return data.add(x);
    }

    public boolean dequeue() {
        if (isEmpty()) {
            return false;
        }
        data.remove(0);
        return true;
    }

    public boolean isEmpty() {
        return data.isEmpty();
    }

    public int front() {
        if (isEmpty()) {
            return 0;
        }
        return data.get(0);
    }

    public static void main(String[] args) {
        MyQueueWithLL q = new MyQueueWithLL();
        q.enqueue(5);
        q.enqueue(3);
        if (!q.isEmpty()) {
            System.out.println(q.front());
        }
        q.dequeue();
        if (!q.isEmpty()) {
            System.out.println(q.front());
        }
        q.dequeue();

        System.out.println("====" + q.front());

        q.enqueue(4);
        System.out.println(q.front());
        q.dequeue();
        System.out.println("===" + q.front());
    }
}
