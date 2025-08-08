package day_9_assignment.comparable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

//Q1. Sort a list of students by roll number (ascending) using Comparable.
//Create a Student class with fields: rollNo, name, and marks. 
//Implement the Comparable interface to sort students by their roll numbers.
//

public class Student implements Comparable<Student> {

	int rollNo;
	String name;
	int marks;

	Student(int rollNo, String name, int marks) {
		this.rollNo = rollNo;
		this.name = name;
		this.marks = marks;
	}

	public String toString() {
		return rollNo + " " + name + " " + marks;
	}

	@Override
	public int compareTo(Student s) {

		return rollNo - s.rollNo;
	}

	public static void main(String[] args) {

		ArrayList<Student> list = new ArrayList<>(Arrays.asList(new Student(10, "Prasenjit", 95),
				new Student(3, "Peter", 88), new Student(2, "Ben", 78), new Student(1, "Shinchan", 81)));

		Collections.sort(list);

		for (Student s : list) {
			System.out.println(s);
		}

	}

}
