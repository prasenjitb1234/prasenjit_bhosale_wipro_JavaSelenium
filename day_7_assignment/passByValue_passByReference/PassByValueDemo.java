package day_7_assignment.passByValue_passByReference;

//Pass by value and pass by reference

//1.	Write a program where a method accepts an integer parameter and tries to change its value.
//Print the value before and after the method call.

public class PassByValueDemo {

	static void changeValue(int num) {
		System.out.println("Inside method, before change: " + num);
		num = 50;
		System.out.println("Inside method, after change: " + num);
	}

	public static void main(String[] args) {
		int number = 10;
		System.out.println("Before method call: " + number);

		changeValue(number);

		System.out.println("After method call: " + number);
	}
}