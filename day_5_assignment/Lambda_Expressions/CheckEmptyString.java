package day_5_assignment.Lambda_Expressions;

import java.util.function.Predicate;

//3.	Check If a String Is Empty
//Create a lambda (via a functional interface like Predicate<String>) that returns true if a given string is empty.
//Predicate<String> isEmpty = s -> s.isEmpty();


public class CheckEmptyString {
	public static void main(String[] args) {
		Predicate<String> isEmpty = s -> s.isEmpty();

		System.out.println(isEmpty.test(""));
		System.out.println(isEmpty.test("Hello"));
		System.out.println(isEmpty.test(" "));
	}
}
