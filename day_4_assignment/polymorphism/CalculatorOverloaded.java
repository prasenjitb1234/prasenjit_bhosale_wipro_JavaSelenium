package day_4_assignment.polymorphism;

//1.Create a class Calculator with the following overloaded add()
//1.add(int a, int b)
//2.add(int a, int b, int c)
//3.add(double a, double b)

public class CalculatorOverloaded {

	void add(int a, int b) {
		System.out.println("Sum of two integers: " + (a + b));
	}

	void add(int a, int b, int c) {
		System.out.println("Sum of three integers: " + (a + b + c));
	}

	void add(double a, double b) {
		System.out.println("Sum of two doubles: " + (a + b));
	}

	public static void main(String[] args) {

		CalculatorOverloaded cal = new CalculatorOverloaded();

		cal.add(10, 20);
		cal.add(10, 20, 30);
		cal.add(20.5, 10.5);

	}
}
