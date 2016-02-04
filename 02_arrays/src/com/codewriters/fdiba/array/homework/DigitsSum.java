package com.codewriters.fdiba.array;

import java.util.Scanner;

/**
 * Write a program that sums the digits of the numbers in a given array.
 *
 * @author Aleksandar Savev <savevjr@gmail.com>
 * @since 04-Feb-2016
 */
public class Digits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        scanner.close();
        
        int sum = 0;
        for (char c : input.toCharArray())
            if (Character.isDigit(c))
                sum += c - '0';

        System.out.println(sum);
    }
}
