package org.yu.code.recursion;

import org.junit.Assert;
import org.junit.Test;

public class FibonacciTest {
    @Test
    public void fibonacci() throws Exception {
        Assert.assertEquals(new Fibonacci().fibonacci(10), new Fibonacci().fibonacciRecursion(10));
    }
}