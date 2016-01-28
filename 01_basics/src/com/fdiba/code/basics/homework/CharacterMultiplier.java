package com.fdiba.code.basics.homework;

import java.util.Scanner;

/**
 * @author Tsvetan Dimitrov <tsvetan.dimitrov@ontotext.com>
 * @since 19-Jan-2016
 */
public class CharacterMultiplier {

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        String[] strParts = input.split(" ");

        String str1 = strParts[0];
        String str2 = strParts[1];

        int sum = 0;
        if (str1.length() > str2.length()) {
            for (int i = 0; i < str1.length(); i++) {
                if (i <= str2.length()) {
                    sum += (str1.charAt(i) * str2.charAt(i));
                } else {
                    sum += str1.charAt(i);
                }
            }
        } else {
            for (int i = 0; i < str2.length(); i++) {
                if (i <= str1.length()) {
                    sum += (str1.charAt(i) * str2.charAt(i));
                } else {
                    sum += str2.charAt(i);
                }
            }
        }

        System.out.println(sum);
    }
}
