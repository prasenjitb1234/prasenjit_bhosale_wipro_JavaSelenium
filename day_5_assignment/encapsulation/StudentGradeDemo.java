package day_5_assignment.encapsulation;

//Student with Grade Validation & Configuration

//Ensure marks are always valid and immutable once set.
//	Create a Student class with private fields: name, rollNumber, and marks.
//	Use a constructor to initialize all values and enforce marks to be between 0 and 100; invalid values reset to 0.
//	Provide getter methods, but no setter for marks (immutable after object creation).
//	Add displayDetails() to print all fields.
//In future versions, you might allow updating marks only via a special inputMarks(int newMarks) method that has stricter logic (e.g. cannot reduce marks). Design accordingly.

class Student {

	private String name;
	private int rollno;
	private int marks;

	public Student(String name, int rollno, int marks) {
		this.name = name;
		this.rollno = rollno;

		if (marks >= 0 && marks <= 100) {
			this.marks = marks;
		} else {
			this.marks = 0; // invalid marks reset to 0
		}
	}

	public String getName() {
		return name;
	}

	public int getRollno() {
		return rollno;
	}

	public int getMarks() {
		return marks;
	}

	// Display method
	public void displayDetails() {
		System.out.println("Name: " + name);
		System.out.println("Roll Number: " + rollno);
		System.out.println("Marks: " + marks);
	}

}

public class StudentGradeDemo {
	public static void main(String[] args) {

		Student s1 = new Student("Prasenjit", 101, 95);

		s1.displayDetails();
		System.out.println("----------");

	}
}
