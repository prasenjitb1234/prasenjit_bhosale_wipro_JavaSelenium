package day_4_assignment.polymorphism;

// Question.
// Create a base class Vehicle with method start().
// Derive Car, Bike, and Truck from it and override the start() method.
// Create a static method that accepts Vehicle type and calls start().
// Pass different vehicle objects to test polymorphism.

class Vehicle // base class
{
	void start() {
		System.out.println("Vehicle is starting");
	}
}

class Car extends Vehicle {

	void start() {
		System.out.println("Car is starting with key");
	}
}

class Bike extends Vehicle {

	void start() {
		System.out.println("Bike is starting with kick");
	}
}

class Truck extends Vehicle {

	void start() {
		System.out.println("Truck is starting with button");
	}
}

public class VehicleTest {

	static void startVehicle(Vehicle v) {
		v.start();
	}

	public static void main(String[] args) {

		Vehicle car = new Car();
		Vehicle bike = new Bike();
		Vehicle truck = new Truck();

		System.out.println(" Testing Polymorphism : : ");
		startVehicle(car);
		startVehicle(bike);
		startVehicle(truck);
	}
}
