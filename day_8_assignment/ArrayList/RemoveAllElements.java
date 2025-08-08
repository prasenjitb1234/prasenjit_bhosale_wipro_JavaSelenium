package day_8_assignment.ArrayList;

import java.util.ArrayList;
import java.util.List;

//7. Remove All Elements
//Write a program to:
//•	Create an ArrayList of integers.
//•	Add multiple elements.
//•	Remove all elements using clear() method.
//•	Display the size of the list.


public class RemoveAllElements {
	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<>(List.of(10,20,30,40,50,60,70,80,90,100));
		
		System.out.println("List is : "+list);
		
		list.clear();
		System.out.println("After removing all elements : "+list);
		
		System.out.println("Size after remove : "+list.size());
		
		
	}
}
