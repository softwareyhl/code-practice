package org.yu.code.queuestack;

import java.util.ArrayDeque;
import java.util.Deque;

public class QueueByTwoStacks {

    private Deque<Integer> in;
    private Deque<Integer> out;

    public QueueByTwoStacks() {
        in = new ArrayDeque<>();
        out = new ArrayDeque<>();
    }

    public Integer poll() {
        move();
        return out.isEmpty() ? null : out.pollFirst();
    }

    private void move() {
        if (out.isEmpty()) {
            while (!in.isEmpty()) {
                out.offerFirst(in.pollFirst());
            }
        }
    }

    public void offer(int element) {
        in.offerFirst(element);
    }

    public Integer peek() {
        move();
        return out.pollFirst();
    }

    public int size() {
        return in.size() + out.size();
    }

    public boolean isEmpty() {
        return size() > 0;
    }
}
