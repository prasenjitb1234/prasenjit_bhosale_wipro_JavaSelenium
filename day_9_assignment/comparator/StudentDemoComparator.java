package day_9_assignment.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

//Q6. Sort a list of students by marks (descending) using Comparator.

//Create a Comparator class or use a lambda expression to sort by marks.

class Student {
	int id;
	String name;
	int marks;

	Student(int id, String name, int marks) {
		this.id = id;
		this.name = name;
		this.marks = marks;
	}

	public String toString() {
		return id + " " + name + " " + marks;
	}

}

public class StudentDemoComparator implements Comparator<Student> {

	@Override
	public int compare(Student s1, Student s2) {

		return Integer.compare(s2.marks, s1.marks);
	}

	public static void main(String[] args) {

		ArrayList<Student> list = new ArrayList<>();

		list.add(new Student(102, "Prasenjit", 95));
		list.add(new Student(105, "Peter", 86));
		list.add(new Student(104, "Ben", 76));

		Collections.sort(list, new StudentDemoComparator());

		list.forEach(System.out::println);

	}

}
