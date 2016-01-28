package com.fdiba.code.basics.homework;

import java.util.Scanner;

/**
 * @author Tsvetan Dimitrov <tsvetan.dimitrov@ontotext.com>
 * @since 19-Jan-2016
 */
public class BodyMassIndex {

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How much do you weigh (kg)?".toUpperCase());
        float weight = scanner.nextFloat();
        System.out.println("How tall are you (m)?");
        float height = scanner.nextFloat();

        float bmi = weight / (height * height);

        if (bmi < 18.5){
            System.out.println("You are underweight!");
            System.out.println("You should put some meat on those bones \u0001");
        }
        else if (bmi > 18.5 && bmi < 24.9) {
            System.out.println("Your weight is normal!");
            System.out.println("You are probably really hot \u0001");
        }
        else if (bmi > 25 && bmi < 29.9) {
            System.out.println("You are a bit overweight!");
            System.out.println("Go run in the park \u0001");
        }
        else if (bmi > 30) {
            System.out.println("You are one fat dude!");
            System.out.println("Obesity is a very dangerous disease. Please take measures \u0001");
        }

    }
}
