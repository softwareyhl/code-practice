package org.yu.code.sort;


/*
* time complexity: O(nlogn)
* space complexity: O(n)
* */
public class MergeSort {
    public int[] mergeSort(int[] array) {
        if (array == null || array.length < 2) {
            return array;
        }
        int[] helper = new int[array.length];
        mergeSort(array, helper, 0, array.length - 1);
        return array;
    }

    private void mergeSort(int[] array, int[] helper, int left, int right) {
        if (left >= right) {
            return;
        }
        int mid = left + (right - left) / 2;
        mergeSort(array, helper, left, mid);
        mergeSort(array, helper, mid + 1, right);
        merge(array, helper, left, mid, right);
    }

    private void merge(int[] array, int[] helper, int left, int mid, int right) {
        for (int i = left; i <= right; i++) {
            helper[i] = array[i];
        }

        int leftBound = left;
        int rightBound = mid + 1;
        while (leftBound <= mid && rightBound <= right) {
            if (helper[leftBound] < helper[rightBound]) {
                array[left++] = helper[leftBound++];
            } else {
                array[left++] = helper[rightBound++];
            }
        }

        while (leftBound <= mid) {
            array[left++] = helper[leftBound++];
        }
    }
}
