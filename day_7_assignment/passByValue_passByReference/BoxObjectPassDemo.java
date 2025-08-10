package day_7_assignment.passByValue_passByReference;

// 4. Create a class Box with a variable length.
//    Modify the value of length by passing the Box object to a method.
//    Show that the original object is modified.

class Box {
	int length;
}

public class BoxObjectPassDemo {

	static void changeLength(Box b) {
		System.out.println("Inside method (before change): length = " + b.length);

		b.length = 50;

		System.out.println("Inside method (after change): length = " + b.length);
	}

	public static void main(String[] args) {

		Box myBox = new Box();
		myBox.length = 20;

		System.out.println("Before method call: length = " + myBox.length);

		changeLength(myBox);

		System.out.println("After method call: length = " + myBox.length);
	}
}
