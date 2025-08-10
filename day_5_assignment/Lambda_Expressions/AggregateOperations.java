package day_5_assignment.Lambda_Expressions;

import java.util.Arrays;

// 7. Aggregate Operations (Sum, Max, Average) on Double Arrays

public class AggregateOperations {
	public static void main(String[] args) {

		double[] numbers = { 2.5, 7.8, 1.2, 9.4, 5.6 };

		// sum
		double sum = Arrays.stream(numbers).sum();

		// max
		double max = Arrays.stream(numbers).max().orElse(Double.NaN);

		// average
		double average = Arrays.stream(numbers).average().orElse(Double.NaN);

		System.out.println("Sum: " + sum);
		System.out.println("Max: " + max);
		System.out.println("Average: " + average);
	}
}
