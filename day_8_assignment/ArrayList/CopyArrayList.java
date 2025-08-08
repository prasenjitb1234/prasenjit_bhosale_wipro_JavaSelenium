package day_8_assignment.ArrayList;

import java.util.ArrayList;
import java.util.List;

//10. Copy One ArrayList to Another
//Write a program to:
//•	Create an ArrayList with some elements.
//•	Create a second ArrayList.
//•	Copy all elements from the first to the second using addAll() method.


public class CopyArrayList {
	public static void main(String[] args) {
		
		ArrayList<Integer> list1 = new ArrayList<>(List.of(1,2,3,4,5,6,7,8,9,10));
		
		System.out.println("Original List : "+list1);
		
		ArrayList<Integer> list2 = new ArrayList<>();
		
		list2.addAll(list1);
		
		System.out.println("Copied List : "+list2);
		
	}
}
