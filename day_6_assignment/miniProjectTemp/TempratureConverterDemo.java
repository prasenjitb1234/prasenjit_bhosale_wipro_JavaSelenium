package day_6_assignment.miniProjectTemp;

import java.util.Scanner;

//Mini Project – Temperature Converter 
//1.	Prompt user for a temperature in Celsius (double).
//2.	Convert it to Fahrenheit:
//double fahrenheit = celsius * 9/5 + 32;
//3.	Then cast that fahrenheit to int for display.
//4.	Print both the precise (double) and truncated (int) values, and comment on precision loss.

public class TempratureConverterDemo {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter Temperature in Celsius (double): ");
		double celsius = sc.nextDouble();

		
		double fahrenheit = celsius * 9 / 5 + 32;

		// Cast to int (truncates decimal part)
		int truncatedFahrenheit = (int) fahrenheit;

		System.out.println("Temperature in Fahrenheit (precise): " + fahrenheit);
		System.out.println("Temperature in Fahrenheit (truncated to int): " + truncatedFahrenheit);

		System.out.println("\nNote: The int version loses precision because decimals are cut off.");

	}
}
