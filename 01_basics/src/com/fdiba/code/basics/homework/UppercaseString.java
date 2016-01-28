package com.fdiba.code.basics.homework;

import java.util.Scanner;

/**
 * @author Tsvetan Dimitrov <tsvetan.dimitrov@ontotext.com>
 * @since 19-Jan-2016
 */
public class UppercaseString {

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();

        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] >= 'A' && chars[i] <= 'Z') {
                continue;
            }
            chars[i] = (char)(chars[i] - ' ');
        }
        System.out.println(new String(chars));
    }
}
