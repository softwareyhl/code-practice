package org.yu.code.binarysearch;


/*
* Given a 2D matrix that contains integers only, which each row is sorted in an ascending order. The first element of next row is larger than (or equal to) the last element of previous row.
* Given a target number, returning the position that the target locates within the matrix. If the target number does not exist in the matrix, return {-1, -1}.
* Assumptions:
* The given matrix is not null, and has size of N * M, where N >= 0 and M >= 0.
* Examples:
* matrix = { {1, 2, 3}, {4, 5, 7}, {8, 9, 10} }
* target = 7, return {1, 2}
* target = 6, return {-1, -1} to represent the target number does not exist in the matrix.
*
* */
public class SearchInSortedMatrix {
    public int[] search(int[][] matrix, int target) {
        if (matrix == null || matrix.length < 1 || matrix[0].length < 1) {
            return new int[]{-1, -1};
        }

        final int totalRows = matrix.length;
        final int totalCols = matrix[0].length;
        int left = 0;
        int right = totalCols * totalRows - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int col = mid % totalCols;
            int row = mid / totalCols;
            if (matrix[row][col] == target) {
                return new int[]{row, col};
            } else if (matrix[row][col] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return new int[]{-1, -1};
    }
}
