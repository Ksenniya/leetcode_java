package org.example.queue;

public class MyQueue {

    private int[] data;
    private int head;
    private int tail;

    public MyQueue() {
        data = new int[1000];
        head = 0;
        tail = 0;
    }

    public boolean enqueue(int x) {
        data[tail] = x;
        tail++;
        return true;
    }

    public boolean dequeue() {
        if (isEmpty()) {
            return false;
        }
        head++;
        return true;
    }

    public boolean isEmpty() {
        return head == tail;
    }

    public int front() {
        return data[head];
    }


    public static void main(String[] args) {
        MyQueue q = new MyQueue();
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
        if (!q.isEmpty()) {
            System.out.println(q.front());
        }
        q.enqueue(4);
        System.out.println(q.front());
        q.dequeue();
        System.out.println("===" + q.front());
    }
}
