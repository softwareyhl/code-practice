package org.yu.code.binarysearch;

import org.junit.Test;

public class FirstOccurenceTest {
    @Test
    public void firstOccur() throws Exception {
        int[] test = {1, 1, 2, 2, 2, 3, 8};
        int target = 2;
        System.out.println(new FirstOccurence().firstOccur(test, target));
    }
}