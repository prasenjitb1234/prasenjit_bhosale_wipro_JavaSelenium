package day_8_assignment.ArrayList;

import java.util.ArrayList;

//. Remove Specific Element
//Write a program to:
//•	Create an ArrayList of Strings.
//•	Add 5 fruits.
//•	Remove a specific fruit by name.
//•	Display the updated list.


public class RemoveAnElement {
	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<>();
		
		list.add("apple");
		list.add("banana");
		list.add("Cherry");
		list.add("dragonfruit");
		list.add("mango");
		
		System.out.println("Original List : "+list);
		
		list.remove("Cherry"); // removed by object 
		
		System.out.println("Updated List : "+list);
		
		
		
	}
}
