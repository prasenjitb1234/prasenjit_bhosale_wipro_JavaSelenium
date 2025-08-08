package day_7_assignment.wrapper_class;

import java.util.Scanner;

//2.	Compare two Strings

public class CompareTwoStrings {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter first string : ");
		String str1 = sc.nextLine();

		System.out.println("Enter Second String : ");
		String str2 = sc.nextLine();

		if (str1.equals(str2)) {
			System.out.println("Both Strings are equal ");
		} else {
			System.out.println("Both Strings are Not Equal");
		}

	}
}
