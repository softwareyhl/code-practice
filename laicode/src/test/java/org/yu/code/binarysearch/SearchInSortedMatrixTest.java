package org.yu.code.binarysearch;

import org.junit.Test;

import java.util.Arrays;

public class SearchInSortedMatrixTest {
    @Test
    public void search() throws Exception {
        int[][] matrix = new int[][]{{1, 2, 3}, {4, 5, 7}, {8, 9, 10}};
        int target = 9;
        Arrays.stream(new SearchInSortedMatrix().search(matrix, target)).forEach(System.out::println);
    }
}