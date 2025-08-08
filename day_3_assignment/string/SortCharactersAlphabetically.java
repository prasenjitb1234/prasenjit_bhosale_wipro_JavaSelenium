package day_3_assignment.string;

import java.util.Arrays;

public class SortCharactersAlphabetically {
	public static void main(String[] args) {

//		Write a program to sort characters of a String Alphabetically

		String str = "prasenjit";

		
		char[] arr = str.toCharArray();

		
		Arrays.sort(arr);

		
		String sortedStr = new String(arr);

		
		System.out.println("Original String: " + str);
		System.out.println("Sorted String: " + sortedStr);

	}
}
