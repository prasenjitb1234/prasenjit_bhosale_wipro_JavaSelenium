package day_9_assignment.comparator;

import java.time.LocalDate;
import java.util.*;

//Q8. Sort Employee objects by joining date using Comparator.
//Use Comparator to sort employees based on LocalDate or Date.

class Employee {
	int id;
	String name;
	LocalDate joiningDate;

	Employee(int id, String name, LocalDate joiningDate) {
		this.id = id;
		this.name = name;
		this.joiningDate = joiningDate;
	}

	@Override
	public String toString() {
		return id + " " + name + " " + joiningDate;
	}
}

public class EmployeeDemo {
	public static void main(String[] args) {

		ArrayList<Employee> list = new ArrayList<>();
		list.add(new Employee(1, "Prasenjit", LocalDate.of(2025, 9, 10)));
		list.add(new Employee(2, "Peter", LocalDate.of(2024, 3, 15)));
		list.add(new Employee(3, "Amit", LocalDate.of(2023, 1, 25)));

		System.out.println("Before Sorting:");
		list.forEach(System.out::println);

		// Sort by joining Date ascending
		list.sort(Comparator.comparing(e -> e.joiningDate));

		System.out.println("\nSorted by Joining Date (Ascending):");
		list.forEach(System.out::println);

		// Sort by joining Date descending
		list.sort(Comparator.comparing((Employee e) -> e.joiningDate).reversed());

		System.out.println("\nSorted by Joining Date (Descending):");
		list.forEach(System.out::println);
	}
}
