package day_8_assignment.treeset;

import java.util.TreeSet;

// 1. Create a TreeSet of Strings:
//	Add 5 country names in random order.
//	Print the sorted list of countries using TreeSet.

public class CountryTreeSetDemo {
	public static void main(String[] args) {
		TreeSet<String> countries = new TreeSet<>();

		// Add countries in random order
		countries.add("India");
		countries.add("USA");
		countries.add("Australia");
		countries.add("United Kingdom");
		countries.add("Japan");

		System.out.println("Countries in sorted order:");
		for (String country : countries) {
			System.out.println(country);
		}
	}
}
