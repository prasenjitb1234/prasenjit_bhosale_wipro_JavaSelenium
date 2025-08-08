package day_5_assignment.Lambda_Expressions;

import java.util.function.Predicate;

public class CheckEmptyString {
	public static void main(String[] args) {
		Predicate<String> isEmpty = s -> s.isEmpty();

		System.out.println(isEmpty.test(""));
		System.out.println(isEmpty.test("Hello"));
		System.out.println(isEmpty.test(" "));
	}
}
