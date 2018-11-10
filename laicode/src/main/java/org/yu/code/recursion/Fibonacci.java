package org.yu.code.recursion;

public class Fibonacci {

    public long fibonacciRecursion(int k) {
        if (k <= 0) {
            return 0;
        }
        if (k == 1) {
            return 1;
        }

        return fibonacciRecursion(k - 2) + fibonacciRecursion(k - 1);
    }

    //use DP, time complexity is still 2^n, space is O(n), can avoid stack over flow
    public long fibonacci(int k) {
        if (k <= 0) {
            return 0;
        }
        long[] M = new long[k + 1];
        M[1] = 1;
        for (int i = 2; i <= k; i++) {
            M[i] = M[i - 2] + M[i - 1];
        }
        return M[k];
    }
}
