package day_8_assignment.LinkedList;

import java.util.LinkedList;
import java.util.List;

//10. Clone a LinkedList
//Write a program to:
//•	Create a LinkedList of numbers.
//•	Clone it using the clone() method.
//•	Display both original and cloned lists.


public class CloneALinkedList {
	public static void main(String[] args) {
		
		LinkedList<Integer> list1 = new LinkedList<>(List.of(1,2,3,4,5));
		
		System.out.println("Original List : "+list1);
		
		System.out.println("Cloned List : "+ list1.clone());
		
		
	}
}	
