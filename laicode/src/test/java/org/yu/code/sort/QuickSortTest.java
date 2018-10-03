package org.yu.code.sort;

import org.junit.Test;

import java.util.Arrays;

public class QuickSortTest {
    @Test
    public void quickSort() throws Exception {
        int[] testArray = {4, 2, -3, 6, 1, 0, -7};
        Arrays.stream(new QuickSort().quickSort(testArray)).forEach(System.out::println);
    }
}