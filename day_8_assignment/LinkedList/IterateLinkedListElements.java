package day_8_assignment.LinkedList;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

//6. Iterate using ListIterator
//Write a program to:
//•	Create a LinkedList of cities.
//•	Use ListIterator to display the list in both forward and reverse directions.

public class IterateLinkedListElements {
	public static void main(String[] args) {

		LinkedList<String> cities = new LinkedList<>(
				List.of("Mumbai", "Pune", "Bangalore", "New York", "Perth", "Tokyo", "Dubai"));

		System.out.println("Forward Direction : ");
		ListIterator itr = cities.listIterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		System.out.println("\nBackward Direction:");

		while (itr.hasPrevious()) {
			System.out.println(itr.previous());
		}

	}
}
