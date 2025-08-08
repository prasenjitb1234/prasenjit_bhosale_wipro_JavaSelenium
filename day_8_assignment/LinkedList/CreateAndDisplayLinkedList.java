package day_8_assignment.LinkedList;

import java.util.LinkedList;

//Create and Display a LinkedList
//Write a program to:
//•	Create a LinkedList of Strings.
//•	Add five colors to it.
//•	Display the list using a for-each loop.


public class CreateAndDisplayLinkedList {
	public static void main(String[] args) {
		
		LinkedList<String> list = new LinkedList<>();
		
		list.add("Red");
		list.add("Blue");
		list.add("Black");
		list.add("White");
		list.add("Green");
		
		for(String colors : list) {
			System.out.println(colors);
		}
		
		
		
	}
}
