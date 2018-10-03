package org.yu.code.sort;


import org.junit.Test;

import java.util.Arrays;

public class SelectionSortTest {

    @Test
    public void solve() throws Exception {
        int[] testArray = {4, 2, -3, 6, 1};
        int[] result = new SelectionSort().solve(testArray);
        Arrays.stream(result).forEach(System.out::println);


        int[] testArray1 = {};
        int[] result1 = new SelectionSort().solve(testArray1);
        Arrays.stream(result1).forEach(System.out::println);
    }
}