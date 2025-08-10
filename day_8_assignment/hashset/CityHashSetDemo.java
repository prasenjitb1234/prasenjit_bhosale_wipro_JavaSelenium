package day_8_assignment.hashset;

import java.util.HashSet;
import java.util.Iterator;

// 1. Create a HashSet of Strings and demonstrate duplicate handling and iteration

public class CityHashSetDemo {
	public static void main(String[] args) {
		HashSet<String> cities = new HashSet<>();

		cities.add("Mumbai");
		cities.add("Pune");
		cities.add("Satara");
		cities.add("Bangalore");
		cities.add("Hyderabad");

		boolean added = cities.add("Satara");

		if (added) {
			System.out.println("Duplicate city added.");
		} else {
			System.out.println("Duplicate city not added.");
		}

		// Iterate using Iterator
		Iterator<String> itr = cities.iterator();

		System.out.println("Cities in the HashSet:");
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
