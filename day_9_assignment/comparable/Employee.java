package day_9_assignment.comparable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

//Q3. Create an Employee class and sort by name using Comparable.
//Use the compareTo() method to sort alphabetically by employee names.

public class Employee implements Comparable<Employee> {

	int empId;
	String empName;
	int empSalary;

	Employee(int empId, String empName, int empSalary) {
		this.empId = empId;
		this.empName = empName;
		this.empSalary = empSalary;
	}

	public String toString() {
		return empId + " " + empName + " " + empSalary;
	}

	@Override
	public int compareTo(Employee e) {

		return this.empName.compareTo(e.empName);
	}

	public static void main(String[] args) {

		ArrayList<Employee> list = new ArrayList<>(Arrays.asList(new Employee(1, "Prasenjit", 90000),
				new Employee(2, "Peter", 80000), new Employee(3, "Aditya", 75000), new Employee(4, "Dhruv", 10000),
				new Employee(5, "Nobita", 88000)

		));

		Collections.sort(list);

		for (Employee e : list) {
			System.out.println(e);
		}

	}

}
