package org.yu.code.binarysearch;

import org.junit.Test;

import static org.junit.Assert.*;

public class ClosestInSortedTest {
    @Test
    public void closest() throws Exception {
        int[] test = {1, 1, 2, 2, 2, 3, 8};
        int target = 4;
        System.out.println(new ClosestInSorted().closest(test, target));
    }
}