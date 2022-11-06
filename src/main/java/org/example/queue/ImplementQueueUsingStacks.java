package org.example.queue;

import java.util.Stack;

public class ImplementQueueUsingStacks {

    private Stack<Integer> s1 = new Stack<>();
    private Stack<Integer> s2 = new Stack<>();


    public ImplementQueueUsingStacks() {

    }

    public void push(int x) {

        s1.push(x);

    }

    public int pop() {

        if (s2.isEmpty()){
            while(!s1.isEmpty()){
                s2.push(s1.pop());
            }
        }

        return  s2.pop();

    }

    public int peek() {

        if (s2.isEmpty()){
            while(!s1.isEmpty()){
                s2.push(s1.pop());
            }
        }

        return  s2.peek();


    }

    public boolean empty() {
        return s1.isEmpty() && s2.isEmpty();
    }
}
