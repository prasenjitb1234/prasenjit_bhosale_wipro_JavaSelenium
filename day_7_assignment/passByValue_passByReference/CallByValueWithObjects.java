package day_7_assignment.passByValue_passByReference;

//7.	Create a program to show that Java is strictly "call by value" even when passing objects (object references are passed by value).

class Box1 {
	int length;
}

public class CallByValueWithObjects {
	
	static void changeReference(Box1 b) {
		System.out.println("Inside method, before change: length = " + b.length);
		b = new Box1(); // new object
		b.length = 200;
		System.out.println("Inside method, after change: length = " + b.length);
	}

	public static void main(String[] args) {
		
		Box1 box1 = new Box1();
		box1.length = 50;
		
		System.out.println("Before method call: length = " + box1.length);
		
		changeReference(box1);
		
		System.out.println("After method call: length = " + box1.length);
	}
}
