package day_5_assignment.Lambda_Expressions;

import java.util.Arrays;

public class MaxMinLambda {
    public static void main(String[] args) {

        double[] numbers = { 3.5, 7.2, 1.9, 9.8, 4.4 };

        // max Lambda
        double max = Arrays.stream(numbers)
                           .max()
                           .orElse(Double.NaN);

        // min Lambda
        double min = Arrays.stream(numbers)
                           .min()
                           .orElse(Double.NaN);

        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
    }
}
