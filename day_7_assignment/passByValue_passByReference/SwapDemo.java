package day_7_assignment.passByValue_passByReference;

//2.	Create a method that takes two integer values and swaps them. 
//Show that the original values remain unchanged after the method call.

public class SwapDemo {

	static void swap(int a, int b) {
		System.out.println("Inside method, before swap: a = " + a + ", b = " + b);
		int temp = a;
		a = b;
		b = temp;
		System.out.println("Inside method, after swap: a = " + a + ", b = " + b);
	}

	public static void main(String[] args) {
		int x = 5;
		int y = 10;

		System.out.println("Before method call: x = " + x + ", y = " + y);

		swap(x, y);

		System.out.println("After method call: x = " + x + ", y = " + y);
	}
}
