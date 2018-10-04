package org.yu.code.binarysearch;

public class ClosestInSorted {
    private static final int MAGIC_NUMBER = -1;

    public int closest(int[] array, int target) {
        if (array == null || array.length < 1) {
            return MAGIC_NUMBER;
        }
        int left = 0;
        int right = array.length - 1;
        while (left < right - 1) {
            int middle = left + (right - left) / 2;
            if (array[middle] <= target) {
                left = middle;
            } else {
                right = middle;
            }
        }

        if (Math.abs(array[left] - target) < Math.abs(array[right] - target)) {
            return left;
        }
        return right;
    }
}
