package day_8_assignment.ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

//List(ArrayList)
//2. Search an Element
//Write a program to:
//•	Create an ArrayList of integers.
//•	Ask the user to enter a number.
//•	Check if the number exists in the list.


public class SearchAnElement {
	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	
	ArrayList<Integer> list = new ArrayList<>();
		
	list.add(10);
	list.add(20);
	list.add(30);
	list.add(40);
	list.add(50);
	
	
	System.out.println("Enter a number to search in ArrayList : ");
	int target = sc.nextInt();
	
	if(list.contains(target)) {
		System.out.println(target+" Element Exists in Arraylist  at index : "+list.indexOf(target));
	}
	else {
		System.out.println(target+" Element Doesn't Exist in ArrayList !");
	}
	
		
		
	}
	
}
