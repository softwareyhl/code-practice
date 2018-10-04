package org.yu.code.binarysearch;

import org.junit.Test;

import static org.junit.Assert.*;

public class ClassicalBinarySearchTest {
    @Test
    public void binarySearch() throws Exception {

        int[] test = {1,2,5,7,9};
        System.out.println(new ClassicalBinarySearch().binarySearch(test, 4));
        System.out.println(new ClassicalBinarySearch().binarySearch(test, 5));
    }
}