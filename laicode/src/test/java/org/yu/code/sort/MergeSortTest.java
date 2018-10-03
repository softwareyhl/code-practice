package org.yu.code.sort;

import org.junit.Test;

import java.util.Arrays;

public class MergeSortTest {
    @Test
    public void mergeSort() throws Exception {
        int[] testArray = {4, 2, -3, 6, 1, 0, -7};
        Arrays.stream(new MergeSort().mergeSort(testArray)).forEach(System.out::println);
    }
}