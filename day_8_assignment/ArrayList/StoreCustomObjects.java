package day_8_assignment.ArrayList;

import java.util.ArrayList;

//9. Store Custom Objects
//Write a program to:
//•	Create a class Student with fields: id, name, and marks.
//•	Create an ArrayList of Student objects.
//•	Add at least 3 students.
//•	Display the details using a loop.


class Student{
	int id;
	String name;
	int marks;
	
	
	Student(int id, String name, int marks){
		this.id = id;
		this.name = name;
		this.marks = marks;
	}
	
	void display() {
		System.out.println("Id : "+id+" Name : "+name+" Marks : "+marks);
	}
}


public class StoreCustomObjects {
	public static void main(String[] args) {
		
		
		ArrayList<Student> list = new ArrayList<>();
		
		list.add(new Student(1,"Prasenjit",90));
		list.add(new Student(2,"Peter",80));
		list.add(new Student(3,"Prasenjit",95));
		
		
		for(Student s : list ) {
			s.display();
		}
		
	}
}
