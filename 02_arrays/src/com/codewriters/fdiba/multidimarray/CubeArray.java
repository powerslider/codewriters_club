package com.codewriters.fdiba.multidimarray;

/**
 * Demo of a 3D (cube) array.
 *
 * @author Tsvetan Dimitrov <tsvetan.dimitrov@ontotext.com>
 * @since 28-Jan-2016
 */
public class CubeArray {

    public static void main(String args[]) {
        int[][][] cube = {
            {
                {1,   2,  3}, { 4,  5,  6}, { 7,  8,  9}
            },
            {
                {10, 11, 12}, {13, 14, 15}, {16, 17, 18}
            },
            {
                {19, 20, 21}, {22, 23, 24}, {25, 26, 27}
            }
        };

        for (int i = 0; i < cube.length; i++) {
            for (int j = 0; j < cube[i].length; j++) {
                for (int k = 0; k < cube[i][j].length; k++) {
                    System.out.println(String.format("cube[%d][%d][%d] = %d", i, j, k, cube[i][j][k]));
                }
            }
        }
    }
}
