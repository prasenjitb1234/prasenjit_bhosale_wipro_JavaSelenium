package day_6_assignment.Enums;

import java.util.Scanner;

//2: Compass Directions
//Create an enum Direction with the values NORTH, SOUTH, EAST, WEST. 
//Write code to:
//•	Read a Direction from a string using valueOf().
//•	Use switch or if to print movement (e.g. “Move north”).
//Test invalid inputs with proper error handling.

public class CompassDirectionsDemo {

	enum Directions {
		NORTH, SOUTH, EAST, WEST
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a Direction : ");
		String str = sc.next().toUpperCase();

		try {
			Directions d = Directions.valueOf(str);

			switch (d) {
			case NORTH:
				System.out.println("Move North");
				break;
			case SOUTH:
				System.out.println("Move South");
				break;
			case EAST:
				System.out.println("Move East");
				break;
			case WEST:
				System.out.println("Move West");
				break;

			}

		} catch (IllegalArgumentException e) {
			System.out.println("Invalid input! Please enter one of: NORTH, SOUTH, EAST, WEST.");
		}

	}
}
