package com.codewriters.fdiba.array;

/**
 * @author Tsvetan Dimitrov <tsvetan.dimitrov23@gmail.com>
 * @since 21-Jan-2016
 */
public class SymmetricArray {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 5, 4, 3, 2 };

        boolean isSymmetric = true;
        for (int i = 0; i < arr.length / 2 ; i++) {
            if (arr[i] != arr[arr.length - i - 1]) {
                isSymmetric = false;
            }
        }

        System.out.println("Is array symmetric: " + isSymmetric);
    }
}
