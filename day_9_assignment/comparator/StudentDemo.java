package day_9_assignment.comparator;

import java.util.*;

//Q11. Create a program where:
//Student implements Comparable to sort by name
//Use Comparator to sort by marks
//Demonstrate both sorting techniques in the same program.

// Student implements Comparable -> Natural sorting by name
class Student3 implements Comparable<Student3> {
	int id;
	String name;
	int marks;

	Student3(int id, String name, int marks) {
		this.id = id;
		this.name = name;
		this.marks = marks;
	}

	// Natural ordering by name
	@Override
	public int compareTo(Student3 s) {
		return this.name.compareTo(s.name);
	}

	@Override
	public String toString() {
		return id + " " + name + " " + marks;
	}
}

public class StudentDemo {
	public static void main(String[] args) {
		ArrayList<Student3> list = new ArrayList<>();

		list.add(new Student3(1, "Prasenjit", 95));
		list.add(new Student3(2, "Peter", 86));
		list.add(new Student3(3, "Amit", 92));
		list.add(new Student3(4, "Ben", 88));

		System.out.println("Original List:");
		list.forEach(System.out::println);

		// Sorting using Comparable (by name)
		Collections.sort(list);
		System.out.println("\nSorted by Name (Comparable):");
		list.forEach(System.out::println);

		// Sorting using Comparator (by marks descending)
		list.sort(Comparator.comparingInt((Student3 s) -> s.marks).reversed());
		System.out.println("\nSorted by Marks (Comparator - Descending):");
		list.forEach(System.out::println);
	}
}
