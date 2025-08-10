package day_8_assignment.queue;

import java.util.LinkedList;
import java.util.Queue;

//1.	Bank Queue Simulation:
//Create a queue of customer names using Queue<String>.
//	Add 5 customers to the queue.
//	Serve (remove) customers one by one and print the queue after each removal.

public class BankQueueSimulation {
	public static void main(String[] args) {
		Queue<String> customers = new LinkedList<>();

		customers.add("Alice");
		customers.add("Bob");
		customers.add("Charlie");
		customers.add("Diana");
		customers.add("Ethan");

		System.out.println("Initial queue: " + customers);

		// Serve the customers one by ONe
		while (!customers.isEmpty()) {
			String served = customers.poll(); // remove HEAD of the Queue
			System.out.println("Serving customer: " + served);
			System.out.println("Queue after serving: " + customers);
		}
	}
}
