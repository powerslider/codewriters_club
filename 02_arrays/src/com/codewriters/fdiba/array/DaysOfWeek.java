package com.codewriters.fdiba.array;

/**
 * Prints a string array using a foreach loop.
 *
 * @author Tsvetan Dimitrov <tsvetan.dimitrov23@gmail.com>
 * @since 21-Jan-2016
 */
public class DaysOfWeek {

    public static void main(String[] args) {
        String[] daysOfWeek = {
                "Monday",
                "Tuesday",
                "Wednesday",
                "Thursday",
                "Friday",
                "Saturday",
                "Sunday"
        };

        for (String day : daysOfWeek) {
            System.out.println(day);
        }
    }

}
