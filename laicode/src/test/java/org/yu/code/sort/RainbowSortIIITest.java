package org.yu.code.sort;

import org.junit.Test;

import java.util.Arrays;

public class RainbowSortIIITest {
    @Test
    public void rainbowSortII() throws Exception {
        int[] test = {1, 3, 1, 2, 0, 2, 3};
        Arrays.stream(new RainbowSortIII().rainbowSortIII(test, 4)).forEach(System.out::println);
    }
}