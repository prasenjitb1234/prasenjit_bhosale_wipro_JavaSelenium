package day_9_assignment.comparable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

//Q5. Implement a program that sorts a list of custom objects 
//using Comparable, and displays them before and after sorting.

public class Student1 implements Comparable<Student1> {

	int rollNo;
	String name;
	int marks;

	Student1(int rollNo, String name, int marks) {
		this.rollNo = rollNo;
		this.name = name;
		this.marks = marks;
	}

	@Override
	public int compareTo(Student1 s) {

		return this.rollNo - s.rollNo;
	}

	@Override
	public String toString() {
		return rollNo + " " + name + " " + marks;
	}

	public static void main(String[] args) {

		ArrayList<Student1> list = new ArrayList<>(Arrays.asList(new Student1(3, "Prasenjit", 95),
				new Student1(1, "Peter", 88), new Student1(2, "Amit", 92)));

		System.out.println("Before Sorting:");
		for (Student1 s : list) {
			System.out.println(s);
		}

		Collections.sort(list);

		System.out.println("\nAfter Sorting:");
		for (Student1 s : list) {
			System.out.println(s);
		}
	}
}
