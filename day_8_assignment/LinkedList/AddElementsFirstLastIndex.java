package day_8_assignment.LinkedList;

import java.util.LinkedList;

//2. Add Elements at First and Last Position
//Write a program to:
//•	Create a LinkedList of integers.
//•	Add elements at the beginning and at the end.
//•	Display the updated list.



public class AddElementsFirstLastIndex {
	public static void main(String[] args) {
		
		LinkedList<Integer> list = new LinkedList<>();
		
		list.add(20);
		list.add(30);
		list.add(100);
		list.add(10);
		list.add(70);
		
		System.out.println("List is : "+list);
		
		list.addFirst(40);
		list.addLast(90);
		
		System.out.println("Updated List is : "+list);
		
		
		
		
	}
}
