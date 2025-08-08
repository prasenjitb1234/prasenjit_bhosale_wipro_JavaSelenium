package day_8_assignment.LinkedList;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

//7. Sort a LinkedList
//Write a program to:
//•	Create a LinkedList of integers.
//•	Add unsorted numbers.
//•	Sort the list using Collections.sort().
//•	Display the sorted list.


public class SortLinkedList {
	public static void main(String[] args) {
		
		LinkedList<Integer> list = new LinkedList<>(List.of(100,40,10,20,60,50,90,70,30,80));
		
		System.out.println("Unsorted : "+list);
		
		Collections.sort(list);
		System.out.println("Sorted List : "+list);
		
	}
}	
