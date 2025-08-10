package day_10_assignment.fileHandling;

import java.io.*;
//10. Write a program to serialize and deserialize a Student object to and from a file.

class Student implements Serializable {
	int rollNo;
	String name;
	String grade;

	Student(int rollNo, String name, String grade) {
		this.rollNo = rollNo;
		this.name = name;
		this.grade = grade;
	}

	void display() {
		System.out.println("Roll No: " + rollNo + " | Name: " + name + " | Grade: " + grade);
	}
}

public class StudentSerializationDemo {
	public static void main(String[] args) {
		String filePath = "C:\\Users\\prase\\OneDrive\\Desktop\\LearnCodingFileHandling\\student.ser";

		// serialization
		try (FileOutputStream fos = new FileOutputStream(filePath);
				ObjectOutputStream oos = new ObjectOutputStream(fos)) {

			Student s1 = new Student(101, "Prasenjit", "A");
			oos.writeObject(s1);
			System.out.println("Student obj serialized successfully!");

		} catch (IOException e) {
			e.printStackTrace();
		}

		// deseirealized
		try (FileInputStream fis = new FileInputStream(filePath); ObjectInputStream ois = new ObjectInputStream(fis)) {

			Student s2 = (Student) ois.readObject();
			System.out.println("Student obj deserialized successfully!");
			s2.display();

		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
