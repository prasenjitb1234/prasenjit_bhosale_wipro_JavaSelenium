package day_6_assignment.typeCasting;

import java.util.Scanner;

//1.Write a program to:
//	Read an int value from user input.
//	Assign it to a double (implicit widening) and print both.
//	Read a double, explicitly cast it to int, then to short, and print results—demonstrate truncation or overflow.

public class QuestionOne {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number : ");
		int num = sc.nextInt();

		double d = num;

		System.out.println("Integer value : " + num);
		System.out.println("Widened to double : " + d);

		System.out.println("Enter a double : ");
		double num2 = sc.nextDouble();

		int intValue = (int) num2; // explicit cast
		short shortValue = (short) intValue;

		System.out.println("Double Value : " + num2);
		System.out.println("Narrowed to int : " + intValue);
		System.out.println("Further narrowed to short: " + shortValue);

	}
}
