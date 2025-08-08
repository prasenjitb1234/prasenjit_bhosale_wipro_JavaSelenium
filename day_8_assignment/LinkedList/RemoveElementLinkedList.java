package day_8_assignment.LinkedList;

import java.util.LinkedList;
import java.util.List;

//4. Remove Elements
//Write a program to:
//•	Create a LinkedList of animal names.
//•	Remove the first and last elements.
//•	Remove a specific element by value.
//•	Display the list after each removal.


public class RemoveElementLinkedList {
	public static void main(String[] args) {
		
		LinkedList<String> animal = new LinkedList<>(List.of("Dog","Cat","Tiger","Wolf","Cow","Lion","Goat"));
		
		System.out.println("orginal list : "+animal);
		
		animal.removeFirst();
		animal.removeLast();
		
		System.out.println("After removing first and last element : "+animal);
		
		animal.remove(3);
		System.out.println("Removing by index : "+animal);
		
	}
}
