package org.yu.code.binarysearch;


/*
* 1. each iteration make sure search space is decreasing
* 2. make sure not missing target
* */
public class ClassicalBinarySearch {
    public int binarySearch(int[] array, int target) {
        if (array == null) {
            return -1;
        }
        int left = 0;
        int right = array.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (target == array[mid]) {
                return mid;
            } else if (array[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1;
    }
}
