package day_8_assignment.vector;

import java.util.Vector;

//•	Create a Vector of Strings and:
//•	Add at least 4 names.
//•	Check if a specific name exists in the vector.
//•	Replace one name with another.
//•	Clear all elements from the vector.

public class CheckNameVector {
	public static void main(String[] args) {

		Vector<String> name = new Vector<>();
		name.add("Prasenjit");
		name.add("Peter");
		name.add("Shinchan");
		name.add("Ben");

		System.out.println(name.contains("Prasenjit")); // Check if a specific name exists in the vector.

		name.set(2, "Tony");
		System.out.println(name); // replaced name 
		
		name.clear();
		System.out.println("Cleared all Elements : "+name);
	}
}
