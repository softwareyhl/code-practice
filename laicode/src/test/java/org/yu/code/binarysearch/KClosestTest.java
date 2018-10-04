package org.yu.code.binarysearch;

import org.junit.Test;

import java.util.Arrays;

public class KClosestTest {
    @Test
    public void kClosest() throws Exception {
        int[] test = {1, 2, 4, 5, 6, 7, 8};
        int target = 3;
        int k = 3;

        Arrays.stream(new KClosest().kClosest(test, target, k)).forEach(System.out::println);
    }

    @Test
    public void testGetLargetSmaller() {
        int[] test = {1, 4, 6, 8};
        int target = 3;
        System.out.println(new KClosest().getLargestSmaller(test, target));
    }
}