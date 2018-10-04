package org.yu.code.binarysearch;

public class KClosest {
    public int[] kClosest(int[] array, int target, int k) {
        if (array == null || array.length <= k) {
            return array;
        }

        if (k <= 0) {
            return new int[0];
        }

        int left = getLargestSmaller(array, target);
        int right = left + 1;
        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            if (right >= array.length || (left >= 0 && target - array[left] <= array[right] - target)) {
                result[i] = array[left--];
            } else {
                result[i] = array[right++];
            }
        }
        return result;
    }

    public int getLargestSmaller(int[] array, int target) {
        int left = 0;
        int right = array.length - 1;
        while (left < right - 1) {
            int mid = left + (right - left) / 2;
            if (array[mid] <= target) {
                left = mid;
            } else {
                right = mid;
            }
        }
        if (array[left] <= target) {
            return left;
        }
        if (array[right] <= target) {
            return right;
        }
        return -1;
    }
}
