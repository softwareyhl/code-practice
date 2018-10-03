package org.yu.code.sort;

import org.junit.Test;

import java.util.Arrays;

public class MoveZeroesTest {
    @Test
    public void moveZero() throws Exception {
        int[] testArray = {1, -1, 0, 10, 0, 3, 0, 1};
        Arrays.stream(new MoveZeroes().moveZero(testArray)).forEach(System.out::println);
    }
}