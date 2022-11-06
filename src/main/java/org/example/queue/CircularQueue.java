package org.example.queue;

/*

[]
 */
public class CircularQueue {
    private final int[] data;
    private final int length;
    private int head;
    private int tail;

    public CircularQueue(int k) {
        this.data = new int[k];
        this.length = k;
        this.head = -1;
        this.tail = -1;
    }

    public boolean enQueue(int value) {
        if (isFull()) {
            return false;
        }
        if (isEmpty()) {
            head = 0;
            tail = 0;
            this.data[tail] = value;
            return true;
        }
        tail++;
        this.data[tail % length] = value;
        return true;
    }

    public boolean deQueue() {
        if (isEmpty()) {
            return false;
        }
        head++;
        if (isEmpty()) {
            head = -1;
            tail = -1;
        }
        return true;
    }

    public int Front() {
        if (isEmpty()) {
            return -1;
        }
        return data[head % length];
    }

    public int Rear() {
        if (isEmpty()) {
            return -1;
        }
        return data[tail % length];
    }

    public boolean isEmpty() {
        return (head == -1 && tail == -1) || head > tail;

    }

    public boolean isFull() {
        return head == (tail + 1) % length;
    }

    public static void main(String[] args) {
        CircularQueue q = new CircularQueue(5);
        q.enQueue(5);
        q.enQueue(3);
        if (!q.isEmpty()) {
            System.out.println(q.Front());
        }
        q.deQueue();
        if (!q.isEmpty()) {
            System.out.println(q.Front());
        }
        q.deQueue();

        System.out.println("====" + q.Front());

        q.enQueue(4);
        System.out.println(q.Front());
        q.deQueue();
        System.out.println("===" + q.Front());
    }
}
/*

["Rear","isFull","deQueue","enQueue","Rear"]
[[],[],[],[4],[]]

[1, 2 , 3]
h = 2
t = 2

 */