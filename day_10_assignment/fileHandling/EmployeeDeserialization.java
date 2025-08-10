package day_10_assignment.fileHandling;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;


//	20. Write a program to deserialize the employee.ser file and display the object data.

public class EmployeeDeserialization {

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

		void display() {
			System.out.println("Emp ID: " + empId);
			System.out.println("Emp Name: " + empName);
			System.out.println("Emp Role: " + empRole);
		}
	}

	public static void main(String[] args) {
		try (FileInputStream fis = new FileInputStream("employee.ser");
				ObjectInputStream ois = new ObjectInputStream(fis)) {

			Employee emp = (Employee) ois.readObject();
			System.out.println("Deserialization done successfully!");
			emp.display();

		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
