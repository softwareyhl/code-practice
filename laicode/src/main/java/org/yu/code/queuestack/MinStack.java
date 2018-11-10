package org.yu.code.queuestack;

import java.util.ArrayDeque;
import java.util.Deque;

public class MinStack {

    private Deque<Integer> stack;
    private Deque<Integer> minStack;

    public MinStack() {
        stack = new ArrayDeque<>();
        minStack = new ArrayDeque<>();
    }

    public int pop() {
        if (stack.peekFirst() == null) {
            return 0;
        }
        int value = stack.peekFirst();
        if (minStack.peekFirst() == value) {
            minStack.pollFirst();
        }
        return value;
    }

    public void push(int element) {
        stack.offerFirst(element);
        if (minStack.isEmpty() || element <= minStack.peekFirst()) {
            minStack.offerFirst(element);
        }
    }

    public int top() {
        return stack.isEmpty() ? 0 : stack.peekFirst();
    }

    public int min() {
        return minStack.isEmpty() ? 0 : minStack.peekFirst();
    }
}
