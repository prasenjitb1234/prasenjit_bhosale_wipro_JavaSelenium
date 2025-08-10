package day_7_assignment.passByValue_passByReference;

//6. Create a class Student with name and marks. 
//Write a method to update the marks of a student. 
//Demonstrate the changes in the original object.

class Student {
	String name;
	int marks;
}

public class StudentUpdateDemo {
	
	static void updateMarks(Student s, int newMarks) {
		System.out.println("Inside method, before update: " + s.name + " - " + s.marks);
		s.marks = newMarks;
		System.out.println("Inside method, after update: " + s.name + " - " + s.marks);
	}

	public static void main(String[] args) {
		
		Student st = new Student();
		st.name = "Prasenjit";
		st.marks = 75;
		
		System.out.println("Before method call: " + st.name + " - " + st.marks);
		
		updateMarks(st, 90);
		
		System.out.println("After method call: " + st.name + " - " + st.marks);
	}
}
