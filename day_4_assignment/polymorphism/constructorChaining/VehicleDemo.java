package day_4_assignment.polymorphism.constructorChaining;

class Vehicle {
	Vehicle() {
		System.out.println("Vehicle Created");
	}

	void run() {
		System.out.println("Vehicle is running");
	}
}

class Bike extends Vehicle {
	Bike() {
		super(); 
		System.out.println("Bike Created");
	}

	
	void run() {
		System.out.println("Bike is running safely");
	}
}

public class VehicleDemo {
	public static void main(String[] args) {

		Vehicle v = new Bike(); 
		v.run();
	}
}
