package day_8_assignment.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//8. Iterate using Iterator
//Write a program to:
//•	Create an ArrayList of cities.
//•	Use Iterator to display each city.

public class IterateList {
	public static void main(String[] args) {

		ArrayList<String> city = new ArrayList<>(
				List.of("Mumbai", "Pune", "Satara", "Bangalore", "New York", "Tokyo", "Melbourne"));

		Iterator itr = city.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

	}
}
