package org.yu.code.sort;

import org.junit.Test;

import java.util.Arrays;

public class RainbowSortTest {
    @Test
    public void rainbowSort() throws Exception {
        int[] test = {-1, 1, -1, 0, 1, -1};
        Arrays.stream(new RainbowSort().rainbowSort(test)).forEach(System.out::println);
    }

}