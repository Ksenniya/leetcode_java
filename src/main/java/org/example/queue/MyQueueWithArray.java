package org.example.queue;

import java.util.ArrayList;
import java.util.List;

public class MyQueueWithArray {

    private List<Integer> data = new ArrayList<>();

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

    public int front() {
        if (isEmpty()) {
            return 0;
        }
        return data.get(0);
    }

    public boolean isEmpty() {
        return data.isEmpty();
    }

    public static void main(String[] args) {
        MyQueueWithArray q = new MyQueueWithArray();
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
