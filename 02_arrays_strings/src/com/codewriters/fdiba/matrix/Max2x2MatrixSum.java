package com.codewriters.fdiba.matrix;

/**
 * @author Tsvetan Dimitrov <tsvetan.dimitrov23@gmail.com>
 * @since 21-Jan-2016
 */
public class Max2x2MatrixSum {

    public static void main(String[] args) {
        int[][] mat = {
            { 7, 1, 3, 3, 2, 1 },
            { 1, 3, 9 ,8, 5, 6 },
            { 4, 6, 7, 9, 1, 0 }
        };

        int rows = mat.length;
        int cols = mat[0].length;

        int maxSum = 0;
        for (int row = 0; row < rows - 1; row++) {
            for (int col = 0; col < cols - 1; col++) {
                int upperLeft = mat[row][col];
                int upperRight = mat[row][col + 1];
                int bottomLeft = mat[row + 1][col];
                int bottomRight = mat[row + 1][col + 1];

                int sum = upperLeft + upperRight + bottomLeft + bottomRight;
                if (sum > maxSum) {
                    maxSum = sum;
                }
            }
        }

        System.out.println("Max 2x2 sum: " + maxSum);

    }
}
