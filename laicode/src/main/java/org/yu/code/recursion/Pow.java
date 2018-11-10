package org.yu.code.recursion;

public class Pow {
    public long power(int a, int b) {
        if (b == 0) {
            return 1;
        }

        long half = power(a, b / 2);
        if (b % 2 == 0) {
            return half * half;
        } else {
            return half * half * a;
        }
    }
}
