package day_4_assignment.abstract_class;

// Question.
// Design an abstract class Person with fields like name, age, and abstract method getRoleInfo().
// Create subclasses:
//  Student: has course and roll number.
//  Professor: has subject and salary.
//  TeachingAssistant: extends Student and implements getRoleInfo() in a hybrid way.
//  Create and print info for all roles using overridden getRoleInfo().

abstract class Person {
	String name;
	int age;

	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	abstract void getRoleInfo();
}

class Student extends Person {
	String course;
	int rollNo;

	Student(String name, int age, String course, int rollNo) {
		super(name, age);
		this.course = course;
		this.rollNo = rollNo;
	}

	@Override
	void getRoleInfo() {
		System.out.println("Name : " + name);
		System.out.println("Age : " + age);
		System.out.println("Course : " + course);
		System.out.println("Roll No : " + rollNo);
	}
}

class Professor extends Person {
	String subject;
	double salary;

	Professor(String name, int age, String subject, double salary) {
		super(name, age);
		this.subject = subject;
		this.salary = salary;
	}

	@Override
	void getRoleInfo() {
		System.out.println("Name : " + name);
		System.out.println("Age : " + age);
		System.out.println("Subject : " + subject);
		System.out.println("Salary : " + salary);
	}
}

class TeachingAssistant extends Student {
	String subject;

	TeachingAssistant(String name, int age, String course, int rollNo, String subject) {
		super(name, age, course, rollNo);
		this.subject = subject;
	}

	
	void getRoleInfo() {
		System.out.println("Name : " + name);
		System.out.println("Age : " + age);
		System.out.println("Course : " + course);
		System.out.println("Roll No : " + rollNo);
		System.out.println("Also teaches : " + subject);
	}
}

public class Person_Demo {
	public static void main(String[] args) {

		System.out.println(" Student Info ");
		Person s = new Student("Ram", 20, "B.Tech", 101);
		s.getRoleInfo();

		System.out.println(" Professor Info ");
		Person p = new Professor("Dr. Patil", 45, "Physics", 75000);
		p.getRoleInfo();
 
		System.out.println("\n*** Teaching Assistant Info ***");
		Person ta = new TeachingAssistant("Amit", 24, "M.Tech", 202, "Java Programming");
		ta.getRoleInfo();
	}
}
