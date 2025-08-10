package day_10_assignment.fileHandling;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;


// 	19. Write a program to serialize a class Employee and store it in employee.ser.
public class EmployeeSerialization {

	
	static class Employee implements Serializable {
		private static final long serialVersionUID = 1L;

		int empId;
		String empName;
		String empRole;

		Employee(int empId, String empName, String empRole) {
			this.empId = empId;
			this.empName = empName;
			this.empRole = empRole;
		}
	}

	public static void main(String[] args) {
		Employee emp1 = new Employee(1, "Prasenjit", "Developer");

		try (FileOutputStream fos = new FileOutputStream("employee.ser");
				ObjectOutputStream oos = new ObjectOutputStream(fos)) {

			oos.writeObject(emp1);
			System.out.println("Serialization done successfully and Saved to employee.ser");

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
