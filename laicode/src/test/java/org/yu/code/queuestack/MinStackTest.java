package org.yu.code.queuestack;

import org.junit.Assert;
import org.junit.Test;

public class MinStackTest {
    @Test
    public void min() throws Exception {
        MinStack stack = new MinStack();
        stack.push(3);
        stack.push(5);
        stack.push(1);
        stack.push(10);
        stack.push(2);
        stack.push(1);
        Assert.assertEquals(1, stack.min());
        stack.pop();
        Assert.assertEquals(1, stack.min());
    }
}