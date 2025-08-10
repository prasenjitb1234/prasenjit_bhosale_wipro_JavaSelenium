package day_8_assignment.priorityqueue;

import java.util.PriorityQueue;
import java.util.Comparator;

//1.	Hospital Emergency Queue:
//	Create a class Patient with fields: name and severityLevel (int).
//	Use PriorityQueue<Patient> with a comparator to serve the most critical patients first (highest severityLevel).

class Patient {
	String name;
	int severityLevel;

	public Patient(String name, int severityLevel) {
		this.name = name;
		this.severityLevel = severityLevel;
	}

	@Override
	public String toString() {
		return name + " (Severity: " + severityLevel + ")";
	}
}

public class HospitalEmergencyQueue {

	public static void main(String[] args) {

		Comparator<Patient> severityComparator = (p1, p2) -> p2.severityLevel - p1.severityLevel;

		PriorityQueue<Patient> queue = new PriorityQueue<>(severityComparator);

		// Add patients
		queue.add(new Patient("Alice", 5));
		queue.add(new Patient("Bob", 9));
		queue.add(new Patient("Charlie", 2));
		queue.add(new Patient("Diana", 7));
		queue.add(new Patient("Ethan", 10));

		System.out.println("Serving patients based on severity:");

		while (!queue.isEmpty()) {
			Patient nextPatient = queue.poll();
			System.out.println("Serving: " + nextPatient);
		}
	}
}
