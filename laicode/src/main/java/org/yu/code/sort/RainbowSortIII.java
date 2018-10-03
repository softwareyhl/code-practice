package org.yu.code.sort;


/*
*
* Given an array of balls with k different colors denoted by numbers 1- k, sort the balls.
Examples
k=1, {1} is sorted to {1}
k=3, {1, 3, 2, 1, 2} is sorted to {1, 1, 2, 2, 3}
k=5, {3, 1, 5, 5, 1, 4, 2} is sorted to {1, 1, 2, 3, 4, 5, 5}
Assumptions
The input array is not null.
k is guaranteed to be >= 1.
k << logn.
*
* */
public class RainbowSortIII {

    public int[] rainbowSortIII(int[] array, int k) {
        if (array == null || array.length < 2) {
            return array;
        }
        rainbowSortIII(array, 1, k, 0, array.length - 1);
        return array;
    }


    //*
    // each time only make sure two elements sort in order
    // */
    private void rainbowSortIII(int[] array, int leftElement, int rightElement, int leftBound, int rightBound) {
        if (rightBound - leftBound < 1) {
            return;
        }
        int neg = leftBound;
        int zero = leftBound;
        int one = rightBound;

        while (zero <= one) {
            if (array[zero] == leftElement) {
                swap(array, neg++, zero++);
            } else if (array[zero] != rightElement) {
                zero++;
            } else {
                swap(array, zero, one--);
            }
        }

        rainbowSortIII(array, leftElement + 1, rightElement - 1, neg, one);
    }

    private void swap(int[] array, int left, int right) {
        int temp = array[left];
        array[left] = array[right];
        array[right] = temp;
    }
}
