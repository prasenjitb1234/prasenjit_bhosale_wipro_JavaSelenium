package day_8_assignment.treeset;

import java.util.TreeSet;
import java.util.Comparator;

//3.Create a TreeSet with a custom comparator:
//	Sort strings in reverse alphabetical order using Comparator.

public class ReverseOrderTreeSetDemo {
	public static void main(String[] args) {

		Comparator<String> reverseComparator = (s1, s2) -> s2.compareTo(s1);

		TreeSet<String> countries = new TreeSet<>(reverseComparator);

		countries.add("India");
		countries.add("USA");
		countries.add("Australia");
		countries.add("United Kingdom");
		countries.add("Japan");

		System.out.println("Countries in reverse alphabetical order:");
		for (String country : countries) {
			System.out.println(country);
		}
	}
}
