package org.yu.code.util;

public class ArrayUtils {
    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            System.out.print(" ");
        }
    }

    public static void print2DArray(int[][] arrays) {
        for (int i = 0; i < arrays.length; i++) {
            printArray(arrays[i]);
            System.out.println(" ");
        }
    }
}
