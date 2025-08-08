package day_8_assignment.ArrayList;

import java.util.ArrayList;

//	6. Update an Element
//	Write a program to:
//	•	Create an ArrayList of subjects.
//	•	Replace one of the subjects (e.g., “Math” to “Statistics”).
//	•	Print the list before and after the update.

public class UpdateAnElement {
	public static void main(String[] args) {

		ArrayList<String> subject = new ArrayList<>();

		subject.add("Math");
		subject.add("English");
		subject.add("Java");
		subject.add("History");
		subject.add("Geography");

		System.out.println("Before Replacing  : " + subject);

		subject.set(0, "Statistics");

		System.out.println("After Replacing : " + subject);

	}
}
