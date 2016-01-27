package com.codewriters.fdiba.multidimarray;

/**
 * Rotate a matrix by setting its columns as rows.
 *
 * @author Tsvetan Dimitrov <tsvetan.dimitrov23@gmail.com>
 * @since 21-Jan-2016
 */
public class RotatedMatrix {

    public static void main(String[] args) {
        int[][] mat = {
            { 1, 2, 3, 4 },
            { 5, 6, 7, 8 },
            { 9, 0, 1, 2 },
            { 3, 4, 5, 6 }
        };

        int rows = mat.length;
        int cols = mat[0].length;
        
        int[][] rotatedMat = new int[4][4];
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols ; col++) {
                rotatedMat[row][col] = mat[rows - col - 1][row];
                System.out.println(
                        String.format("rotatedMat[%d][%d] = %d", row, col, rotatedMat[row][col]));
            }
        }
    }
}
