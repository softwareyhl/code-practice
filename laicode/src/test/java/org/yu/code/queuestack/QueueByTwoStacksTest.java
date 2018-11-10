package org.yu.code.queuestack;

import org.junit.Test;

public class QueueByTwoStacksTest {

    @Test
    public void poll() throws Exception {
        QueueByTwoStacks queue = new QueueByTwoStacks();
        queue.offer(2);
        queue.offer(3);
        queue.offer(5);
        System.out.println(queue.poll());
        System.out.println(queue.poll());
    }

    @Test
    public void offer() throws Exception {
    }

    @Test
    public void peek() throws Exception {

        QueueByTwoStacks queue = new QueueByTwoStacks();
        queue.offer(2);
        queue.offer(3);
        queue.offer(5);
        System.out.println(queue.peek());
    }

    @Test
    public void size() throws Exception {
        QueueByTwoStacks queue = new QueueByTwoStacks();
        queue.offer(2);
        queue.offer(3);
        queue.offer(5);
        System.out.println(queue.size());
    }

    @Test
    public void isEmpty() throws Exception {
    }
}