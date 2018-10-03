package org.yu.code.sort;

public class RainbowSort {
    public int[] rainbowSort(int[] input) {
        if (input == null || input.length < 2) {
            return input;
        }

        /*
        * neg (~, neg)
        * zero[neg, zero)
        * need to discover [zero, one]
        * positive [one, ~)
        * */
        int neg = 0;
        int pos = input.length - 1;
        int zero = 0;

        while (zero <= pos) {
            if (input[zero] == -1) {
                swap(input, neg++, zero++);
            } else if (input[zero] == 0) {
                zero++;
            } else {
                swap(input, zero, pos--);
            }
        }

        return input;
    }

    private void swap(int[] array, int a, int b) {
        int temp = array[a];
        array[a] = array[b];
        array[b] = temp;
    }
}
