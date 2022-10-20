package org.example.stack;

import java.util.Stack;

public class MinStack {
    private Stack<Integer> stack;
    private Stack<Integer> minStack;
    public MinStack() {
        stack = new Stack<>();
        minStack = new Stack<>();
    }

    public void push(int val) {
        if (minStack.isEmpty()){
            minStack.push(val);
        }
        else if (val <= minStack.peek()){
            minStack.push(val);
        }
        stack.push(val);
    }
    /*
          public void push(int val) {
          if (minStack.isEmpty() || val <= minStack.peek()){
              minStack.push(val);
          }
          stack.push(val);
      }
       */
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
/*
    private Stack<Integer> stack = new Stack<Integer>();
    // minStack: store the current min values
    private Stack<Integer> minStack = new Stack<Integer>();

    public void push(int x) {
        // store current min value into minStack
        if (minStack.isEmpty() || x <= minStack.peek())
            minStack.push(x);
        stack.push(x);
    }

    public void pop() {
        // use equals to compare the value of two object, if equal, pop both of them
        if (stack.peek().equals(minStack.peek()))
            minStack.pop();
        stack.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return minStack.peek();
    }

 */
