package com.interview;

import java.util.Random;

public class GenerateRandomnumbers {

    // by using Math.random() method we can generate random numbers in java.

    // The Math.random() method returns a double value with a positive sign, greater
    // than or equal to 0.0 and less than 1.0.
    // same for loop with math.random() method
    /*
     * for(int i = 0; i < 5; i++)
     * {
     * System.out.println("Random Doubles : "+Math.random());
     * }
     */

    public static void main(String[] args) {
        Random random = new Random();

        // Generating random integers using Random class

        for (int i = 0; i < 5; i++) {
            System.out.println("Random Integers : " + random.nextInt());
        }

        System.out.println("-----------------------------");

        // Generating random doubles using Random class

        for (int i = 0; i < 5; i++) {
            System.out.println("Random Doubles : " + random.nextDouble());
        }

        System.out.println("-----------------------------");

        // Generating random booleans using Random class

        for (int i = 0; i < 5; i++) {
            System.out.println("Random booleans : " + random.nextBoolean());
        }
    }

}
