package day_8_assignment.LinkedList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

//8. Convert LinkedList to ArrayList
//Write a program to:
//•	Create a LinkedList of Strings.
//•	Convert it into an ArrayList.
//•	Display both the LinkedList and ArrayList.


public class LinkedListToArrayList {
	public static void main(String[] args) {
		
		LinkedList<String> list = new LinkedList<>(List.of("Prasenjit","Peter","Ben","Nobita","Shinchan"));
		
		System.out.println("Linked list : "+list);
		
		ArrayList<String> list1 = new ArrayList<>(list);
		
		System.out.println("ArrayList : "+list1);
		
		
		
	}
}
