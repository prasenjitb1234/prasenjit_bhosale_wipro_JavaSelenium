package day_5_assignment.Lambda_Expressions;

//2.Define a functional interface SumCalculator { int sum(int a, int b); } and 
//a lambda expression to sum two integers.

interface SumCalculator {
	int sum(int a, int b);
}

public class LambdaSumExample {
	public static void main(String[] args) {

		SumCalculator calculator = (a, b) -> a + b;

		int result = calculator.sum(15, 25);
		System.out.println("Sum: " + result);
	}
}
