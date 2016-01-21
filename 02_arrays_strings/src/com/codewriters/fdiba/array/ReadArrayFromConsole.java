package com.codewriters.fdiba.array;

import java.util.Scanner;

/**
 * @author Tsvetan Dimitrov <tsvetan.dimitrov23@gmail.com>
 * @since 21-Jan-2016
 */
public class ReadArrayFromConsole {

    public static void main(String[] args) {
        System.out.println("Please enter 5 numbers:");
        Scanner s = new Scanner(System.in);

        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            int num = s.nextInt();
            arr[i] = num;
        }

        System.out.println("Your entered the following array of numbers:");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
