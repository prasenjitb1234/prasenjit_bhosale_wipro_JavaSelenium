package day_8_assignment.ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//4. Sort Elements
//Write a program to:
//•	Create an ArrayList of integers.
//•	Add at least 7 random numbers.
//•	Sort the list in ascending order.
//•	Display the sorted list.


public class SortElements {
	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<>(List.of(40,20,80,10,25,15,50));
		
		Collections.sort(list);
		
		System.out.println("Sorted List : "+list);
		
		
		
	}
}
