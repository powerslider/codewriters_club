package com.codewriters.fdiba.array;

/**
 * Reverse the elements of an array.
 *
 * @author Tsvetan Dimitrov <tsvetan.dimitrov23@gmail.com>
 * @since 21-Jan-2016
 */
public class ReversedArray {

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int length = arr.length;

        int[] reversedArr = new int[length];

        for (int i = 0; i < length; i++) {
            reversedArr[length - i - 1] = arr[i];
        }

        System.out.println("Reversed array:");
        for (int i = 0; i < length; i++) {
            System.out.println(reversedArr[i]);
        }
    }
}
