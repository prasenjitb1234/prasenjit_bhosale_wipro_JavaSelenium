package day_8_assignment.ArrayList;

import java.util.ArrayList;

//5. Reverse the ArrayList
//Write a program to:
//•	Create an ArrayList of characters.
//•	Add 5 characters.
//•	Reverse the list using Collections.reverse() and display it.


public class ReverseList {
	public static void main(String[] args) {
		
		ArrayList<Character> list = new ArrayList<>();
		
		list.add('a');
		list.add('b');
		list.add('c');
		list.add('d');
		list.add('e');
		
		System.out.println("Normal List : "+list );
		System.out.println("Reversed List : "+list.reversed());
		
	}
}
