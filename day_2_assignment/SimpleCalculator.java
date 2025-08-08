package day_2_assignment;

import java.util.Scanner;

public class SimpleCalculator {
	public static void main(String[] args) {
//		* 2. WAP for simple calculator
//		* like addition, subtraction , multiplication, division
		
		Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number: ");
        double num1 = sc.nextDouble();

        System.out.println("Enter second number: ");
        double num2 = sc.nextDouble();

        System.out.println("Choose operation (+, -, *, /): ");
        char op = sc.next().charAt(0);

        double result = 0;

        if (op == '+') {
            result = num1 + num2;
        } else if (op == '-') {
            result = num1 - num2;
        } else if (op == '*') {
            result = num1 * num2;
        } else if (op == '/') {
            if (num2 != 0)
                result = num1 / num2;
            else {
                System.out.println("Cannot divide by zero!");
                return;
            }
        } else {
            System.out.println("Invalid operation");
            return;
        }

        System.out.println("Result: " + result);
		
	}
}
