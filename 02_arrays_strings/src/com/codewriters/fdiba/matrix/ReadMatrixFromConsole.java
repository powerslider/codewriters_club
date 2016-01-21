package com.codewriters.fdiba.matrix;

import java.util.Scanner;

/**
 * @author Tsvetan Dimitrov <tsvetan.dimitrov23@gmail.com>
 * @since 21-Jan-2016
 */
public class ReadMatrixFromConsole {

    public static void main(String[] args) {
        System.out.println("Enter matrix dimensions: ");
        Scanner s = new Scanner(System.in);
        System.out.print("Rows: ");
        int rows = s.nextInt();
        System.out.print("Columns: ");
        int cols = s.nextInt();
        int inputNum;

        System.out.println("Enter matrix values");
        int[][] mat = new int[rows][cols];
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                inputNum = s.nextInt();
                System.out.println(
                        String.format("mat[%d][%d] = %d", row, col, inputNum));
            }
        }

    }
}
