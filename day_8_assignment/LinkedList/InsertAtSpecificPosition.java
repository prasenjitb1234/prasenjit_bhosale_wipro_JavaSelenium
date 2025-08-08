package day_8_assignment.LinkedList;

import java.util.LinkedList;
import java.util.List;

//3. Insert Element at Specific Position
//Write a program to:
//•	Create a LinkedList of names.
//•	Insert a name at index 2.
//•	Display the list before and after insertion.



public class InsertAtSpecificPosition {
	public static void main(String[] args) {
		
		
		LinkedList<String> name = new LinkedList<>(List.of("Tom","Nobita","Shinchan","Peter","Wanda","Ben"));
		
		System.out.println("Before Inserting : "+name);
		
		name.add(2, "Prasenjit");
		
		System.out.println("After Inserting : "+name);
		
		
		
		
		
	}
}
