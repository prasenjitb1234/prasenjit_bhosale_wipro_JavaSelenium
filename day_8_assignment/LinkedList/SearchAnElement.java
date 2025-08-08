package day_8_assignment.LinkedList;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

//5. Search for an Element
//Write a program to:
//•	Create a LinkedList of Strings.
//•	Ask the user for a string to search.
//•	Display if the string is found or not.

public class SearchAnElement {
	public static void main(String[] args) {

		LinkedList<String> list = new LinkedList<>(List.of("Java", "Python", "Javascript", "CPP", "Rust"));

		System.out.println("List is  : " + list);

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter an Element to Search : ");
		String target = sc.next();

		if (list.contains(target)) {
			System.out.println(target + " found in list at index : " + list.indexOf(target));

		} else {
			System.out.println(target + " Not found in list !");
		}

	}
}
