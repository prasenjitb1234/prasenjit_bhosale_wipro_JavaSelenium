package day_8_assignment.treeset;

import java.util.TreeSet;

//2.	Create a TreeSet of Integers:
//	Add some numbers and print the first and last elements.
//	Find the elements lower than and higher than a given number 
//using lower() and higher() methods.

public class IntegerTreeSetDemo {
	public static void main(String[] args) {
		TreeSet<Integer> numbers = new TreeSet<>();

		numbers.add(10);
		numbers.add(30);
		numbers.add(20);
		numbers.add(50);
		numbers.add(40);

		System.out.println("Numbers in TreeSet: " + numbers);

		
		System.out.println("First element: " + numbers.first());
		System.out.println("Last element: " + numbers.last());

		int givenNumber = 25;

		
		Integer lower = numbers.lower(givenNumber);
		if (lower != null) {
			System.out.println("Element lower than " + givenNumber + " is: " + lower);
		} else {
			System.out.println("No element lower than " + givenNumber);
		}

		
		Integer higher = numbers.higher(givenNumber);
		if (higher != null) {
			System.out.println("Element higher than " + givenNumber + " is: " + higher);
		} else {
			System.out.println("No element higher than " + givenNumber);
		}
	}
}
