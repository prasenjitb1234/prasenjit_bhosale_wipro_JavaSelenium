package day_4_assignment.polymorphism.constructorChaining;

// question 4 : 
//4.	Runtime Polymorphism with constructor Chaining                                                             create a class vehicle with a constructor that prints “Vehicle Created”
//Create a subclass Bike that override a method and uses super() in constructor


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
