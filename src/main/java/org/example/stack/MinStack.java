package org.example.stack;

import java.util.Stack;

public class MinStack {

    Stack<Integer> stack = new Stack<>();
    Stack<Integer> minStack = new Stack<>();

    public void push(int val) {
        if (minStack.isEmpty() || val <= minStack.peek()){
            minStack.push(val);
        }
        stack.push(val);
    }

    public void pop() {

        int val = stack.pop();
        if (val == minStack.peek()){
            minStack.pop();
        }
    }

    public int top() {
       return stack.peek();
    }

    public int getMin() {
        return minStack.peek();

    }


}

