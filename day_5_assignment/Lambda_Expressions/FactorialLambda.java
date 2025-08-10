package day_5_assignment.Lambda_Expressions;

interface Factorial {
	long calculate(int n);
}

public class FactorialLambda {
	public static void main(String[] args) {

		Factorial fact = (n) -> {
			long result = 1;
			for (int i = 1; i <= n; i++) {
				result *= i;
			}
			return result;
		};

		int number = 5;
		System.out.println("Factorial of " + number + " = " + fact.calculate(number));
	}
}
