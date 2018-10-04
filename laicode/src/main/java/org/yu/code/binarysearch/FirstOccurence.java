package org.yu.code.binarysearch;

public class FirstOccurence {

    private static final int MAGIC_NUMBER = -1;

    public int firstOccur(int[] array, int target) {
        if (array == null || array.length < 1) {
            return MAGIC_NUMBER;
        }
        int left = 0;
        int right = array.length - 1;

        while (left < right - 1) {
            int mid = left + (right - left) / 2;
            if (array[mid] == target) {
                right = mid;
            } else if (array[mid] < target) {
                left = mid;
            } else {
                right = mid;
            }
        }

        if (array[left] == target) {
            return left;
        }
        if (array[right] == target) {
            return right;
        }
        return MAGIC_NUMBER;
    }
}
